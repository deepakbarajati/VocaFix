package com.vocafix.transcription.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vocafix.transcription.model.Transcription;

public interface TranscriptionRepository extends JpaRepository<Transcription, Long> {
}
