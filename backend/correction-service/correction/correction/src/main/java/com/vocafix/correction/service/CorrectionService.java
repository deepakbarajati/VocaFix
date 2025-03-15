package com.vocafix.correction.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vocafix.correction.model.Correction;
import com.vocafix.correction.repository.CorrectionRepository;

import java.util.HashMap;
import java.util.Map;

@Service
public class CorrectionService {
    private final CorrectionRepository correctionRepository;
    private final String OPENAI_API_URL = "https://api.openai.com/v1/chat/completions";
    private final String OPENAI_API_KEY = "your_openai_api_key";

    public CorrectionService(CorrectionRepository correctionRepository) {
        this.correctionRepository = correctionRepository;
    }

    public Correction correctText(Long transcriptionId, String transcribedText) {
        String correctedText = callOpenAIApi(transcribedText);

        Correction correction = new Correction(null, transcriptionId, correctedText, "Completed");
        return correctionRepository.save(correction);
    }

    private String callOpenAIApi(String text) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "gpt-3.5-turbo");
        requestBody.put("messages", new Object[]{
                Map.of("role", "system", "content", "You are a grammar correction assistant."),
                Map.of("role", "user", "content", "Correct this text: " + text)
        });

        Map<String, String> headers = Map.of("Authorization", "Bearer " + OPENAI_API_KEY);
        Map<String, Object> response = restTemplate.postForObject(OPENAI_API_URL, requestBody, Map.class);
        return (String) ((Map<String, Object>) ((Map<String, Object>) response.get("choices")).get(0)).get("message");
    }
}
