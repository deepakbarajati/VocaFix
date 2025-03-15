package com.vocafix.correction.controller;

import com.vocafix.correction.model.Correction;
import com.vocafix.correction.service.CorrectionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/correction")
public class CorrectionController {
    private final CorrectionService correctionService;

    public CorrectionController(CorrectionService correctionService) {
        this.correctionService = correctionService;
    }

    @PostMapping("/correct")
    public Correction correctText(@RequestParam Long transcriptionId, @RequestParam String transcribedText) {
        return correctionService.correctText(transcriptionId, transcribedText);
    }
}
