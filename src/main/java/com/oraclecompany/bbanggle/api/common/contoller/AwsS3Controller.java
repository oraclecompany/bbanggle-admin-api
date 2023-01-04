package com.oraclecompany.bbanggle.api.common.contoller;


import com.oraclecompany.bbanggle.api.common.service.ImageUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Api(value = "01. AmazonS3", tags = "01. AmazonS3")
public class AwsS3Controller {

    private final ImageUploadService imageUploadService;

    @ApiOperation(value = "AmazonS3 Image Upload API")
    @PostMapping(value = "/image/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> imageUpload(@RequestPart MultipartFile file) throws IOException {
        return ResponseEntity.ok(imageUploadService.imageUpload(file));
    }

}
