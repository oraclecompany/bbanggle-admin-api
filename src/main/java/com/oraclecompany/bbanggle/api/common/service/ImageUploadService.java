package com.oraclecompany.bbanggle.api.common.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ImageUploadService {

    private final AwsS3Service awsS3Service;

    public String imageUpload(MultipartFile file) throws IOException {
        return awsS3Service.upload(file,"images");
    }
}
