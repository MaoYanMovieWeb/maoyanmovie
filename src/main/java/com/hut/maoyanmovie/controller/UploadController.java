package com.hut.maoyanmovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author Cleanmoo
 * @data 2020/12/16
 */

@Controller
public class UploadController {

    @GetMapping("/add")
    public String toUpload() {
        return "upload";
    }

    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpSession session) throws IOException {
        //  1、指定上传的文件夹
        String path = session.getServletContext().getRealPath("/upload");
        System.out.println(path);
        //  2、判断文件夹是否存在，如果不存在则创建该文件夹
        File uploadFilePath = new File(path);
        if (!uploadFilePath.exists()) {
            uploadFilePath.mkdir();
        }
        //  3、重命名
        String fileName = file.getOriginalFilename();

        String ext = fileName.substring(fileName.lastIndexOf("."));

        long time = System.currentTimeMillis();

        String newFileName = time + ext;

        File destFile = new File(path + "/" + newFileName);
        //  4、上传
        file.transferTo(destFile);
        //  5、返回上传路径
        return "uploadSuccess";
    }


}