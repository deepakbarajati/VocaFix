package com.vocafix.transcription.controller;

import com.vocafix.transcription.model.Transcription;
import com.vocafix.transcription.service.TranscriptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transcription")
public class TranscriptionController {
    private final TranscriptionService transcriptionService;

    public TranscriptionController(TranscriptionService transcriptionService) {
        this.transcriptionService = transcriptionService;
    }

    @PostMapping("/process")
    public Transcription processVideo(@RequestParam Long videoId, @RequestParam String fileUrl) {
        return transcriptionService.processVideo(videoId, fileUrl);
    }
}
