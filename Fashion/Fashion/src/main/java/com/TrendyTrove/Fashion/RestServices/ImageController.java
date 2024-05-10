package com.TrendyTrove.Fashion.RestServices;


import com.TrendyTrove.Fashion.Entity.Products;
import com.TrendyTrove.Fashion.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {
    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImageById(@PathVariable int id) throws IOException {
        // Load image from static resource based on ID
        Resource resource = new ClassPathResource("static/images/" + id + ".jpg");

        // Check if the image exists
        if (resource.exists()) {
            // Read image bytes
            byte[] imageBytes = Files.readAllBytes(Path.of(resource.getURI()));
            // Return image response with byte array and content type
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
        } else {
            // Return 404 Not Found if image does not exist
            return ResponseEntity.notFound().build();
        }
    }
}
