package com.johdan.java.semicolonLibrary.cloud;

import com.johdan.java.semicolonLibrary.exceptions.FileUploadFailedException;

import java.io.IOException;
import java.util.Map;

public class CloudinaryService implements CloudService{
    @Override
    public String upload(byte[] bytes){
        String cloudName = "dlvi5kpsr";
        String apiKey = "828148521634137";
        String apiSecret = " 67YO_KW_HRiWfLJq96J2q15_-g8";
        Cloudinary cloudinary = new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name", cloudName,
                        "api_key", apiKey,
                        "api_secret", apiSecret,
                        "secure", true)
        ) ;
        try {
            Map<?,?> map = cloudinary.uploader().upload(bytes, ObjectUtils.emptyMap());
            return uploadResponse.get("url".toString());
        } catch (IOException exception) {
            throw new FileUploadFailedException("Failed to upload Book to cloud");
        }
    }
}
