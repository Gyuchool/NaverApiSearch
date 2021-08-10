package com.springshop.naverapi.aws;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class S3TestController {

    private final S3Uploader s3Uploader;

    @PostMapping("/images")
    public String upload(@RequestParam("image")MultipartFile multipartFile)throws IOException{
        //S3 Bucket 내부에 "static"이라는 이름의 디렉토리가 생성이 됩니다
        s3Uploader.upload(multipartFile,"static");
        return "test";
    }

}
