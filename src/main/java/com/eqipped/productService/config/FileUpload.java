package com.eqipped.productService.config;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class FileUpload {

    @Value("${project.upload}")
    private String dir;

    @Value("${project.image}")
    private String getDir;
//    public final String UPLOAD_DIR = "D:\\eqipped\\eqipped_image";
//    public final String UPLOAD_DIR = dir;
//    public final String GET_DIR = getDir;
//    public final String UPLOAD_DIR = new ClassPathResource("static/images/").getFile().getAbsolutePath();
//    public final String UPLOAD_DIR = ServletUriComponentsBuilder.fromCurrentContextPath().path("static/image/").toUriString();
    public FileUpload() throws IOException {
    }

    public Map<String,Object> uploadFile(MultipartFile multipartFile){

        Map<String,Object> map = new HashMap<>();
        boolean f = false;

        try{
            String imageName = multipartFile.getOriginalFilename();
            String userId = UUID.randomUUID().toString();
            String fileName = userId+imageName;
            Files.copy(multipartFile.getInputStream(), Path.of(dir+ File.separator+fileName), StandardCopyOption.REPLACE_EXISTING);
            map.put("fileName",fileName);
            //String str = ServletUriComponentsBuilder.fromCurrentContextPath().path(getDir).path(fileName).toUriString();
            String str = getDir+fileName;
            map.put("filePath",str);

            f=true;
            map.put("f",f);

        }catch (Exception e)
        {
            map.put("e",e);
            e.printStackTrace();
        }


        return map;
    }

}
