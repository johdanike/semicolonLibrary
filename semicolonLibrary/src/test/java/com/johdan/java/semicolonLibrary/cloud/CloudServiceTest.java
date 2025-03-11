package com.johdan.java.semicolonLibrary.cloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CloudServiceTest {
    @Autowired
    private CloudService cloudService;

    @Test
    public void testCloudServiceCanUploadFile() {
        String fileLocation ="";
        Path path = Path.of(fileLocation);
        try(InputStream inputStream = Files.newInputStream(path)){
            MultipartFile file = new MockMultipartFile(fileLocation, inputStream);
            String url = cloudService.upload(file.getBytes());
            assertThat(url).isNotEmpty();
            assertThat(url).containsIgnoringCase("https");

        }catch (IOException exception){
            log.error("error:: {}", exception.getMessage());
        }
    }
}
