package com.vocafix.video.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.vocafix.video.model.Video;
import com.vocafix.video.repository.VideoRepository;

import java.nio.file.*;

@Service
public class VideoService {
    private final VideoRepository videoRepository;
    private final String uploadDir = "uploads/";

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video uploadVideo(MultipartFile file) throws Exception {
        Path filePath = Paths.get(uploadDir + file.getOriginalFilename());
        Files.write(filePath, file.getBytes());

        Video video = new Video(null, file.getOriginalFilename(), filePath.toString(), "Uploaded");
        return videoRepository.save(video);
    }
}
