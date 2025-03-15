package com.vocafix.video.controller;

import com.vocafix.video.model.Video;
import com.vocafix.video.service.VideoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping("/upload")
    public Video uploadVideo(@RequestParam("file") MultipartFile file) throws Exception {
        return videoService.uploadVideo(file);
    }
}
