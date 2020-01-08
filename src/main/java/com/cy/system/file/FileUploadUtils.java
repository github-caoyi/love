package com.cy.system.file;

import com.cy.system.util.StringUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author cy
 * @Date 2020/1/7 15:55
 * @Description 文件上传工具类
 * @Version 1.0
 **/
public class FileUploadUtils {

    /**
     *文件默认大小 50M
     */
    public static final long DEFAULT_FILE_MAX_SIZE = 50*1024*1024;

    /**
     * 默认的文件名最大长度 100
     */
    public static final int DEFAULT_FILE_NAME_MAX_LENGTH = 100;

    /**
     *M默认上传地址
     */
    private static String defaultBaseDir = "H:";

    private static int counter = 0;

    public static String getDefaultBaseDir() {
        return defaultBaseDir;
    }

    public static void setDefaultBaseDir(String defaultBaseDir) {
        FileUploadUtils.defaultBaseDir = defaultBaseDir;
    }

    /**
     * @Author cy
     * @Date 2020/1/7 16:06
     * @Description 以默认配置进行文件上传
     * @Param file 上传的文件
     * @return 文件名称
     **/
    public static final String upload(MultipartFile file) throws IOException{
        try
        {
            return upload(getDefaultBaseDir(), file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
        }
        catch (Exception e)
        {
            throw new IOException(e.getMessage(), e);
        }
    }

    /**
     * @Author cy
     * @Date 2020/1/7 16:18
     * @Description 根据文件路径上传
     * @Param file 上传的文件
     * @return 文件名称
     **/
    public static final String upload(String baseDir,MultipartFile file) throws IOException{
        try
        {
            return upload(baseDir, file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
        }
        catch (Exception e)
        {
            throw new IOException(e.getMessage(), e);
        }
    }
    
    /**
     * @Author cy
     * @Date 2020/1/7 16:21
     * @Description 文件上传
     * @Param file
     * @return 返回上传成功的文件名
     **/
    public static final String upload(String baseDir,MultipartFile file,String[] allowedExtension) throws IOException{
        int fileNameLength = file.getOriginalFilename().length();
        if(fileNameLength > FileUploadUtils.DEFAULT_FILE_NAME_MAX_LENGTH){
            //超出文件名称最大长度
            throw new IOException("超出文件名称最大长度");
        }
        //校验文件大小
//        assertAllowed(file,allowedExtension);
        String fileName =extractFileName(file);
        //本地存储
        File desc = getAbsoluteFile(baseDir, fileName);
        file.transferTo(desc);

        String pathFileName = baseDir+fileName;
        return pathFileName;
    }

    /**
     * @Author cy
     * @Date 2020/1/7 16:45
     * @Description 编码文件名
     * @Param
     * @return
     **/
    public static final String extractFileName(MultipartFile file){
        String fileName = file.getOriginalFilename();
        //String extension = get
        return fileName;
    }

    /**
     * @Author cy
     * @Date 2020/1/7 16:47
     * @Description 获取文件名的后缀
     * @Param
     * @return
     **/
    public static final String getExtension(MultipartFile file){
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        if (StringUtils.isEmpty(extension)){
            extension = MimeTypeUtils.getExtension(file.getContentType());
        }
        return extension;
    }
    /**
     * @Author cy
     * @Date 2020/1/8 11:06
     * @Description 保存文件
     * @Param 
     * @return 
     **/
    private static final File getAbsoluteFile(String uploadDir, String fileName) throws IOException
    {
        File desc = new File(uploadDir + File.separator + fileName);

        if (!desc.getParentFile().exists())
        {
            desc.getParentFile().mkdirs();
        }
        if (!desc.exists())
        {
            desc.createNewFile();
        }
        return desc;
    }
}
