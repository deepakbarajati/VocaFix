package com.vocafix.correction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vocafix.correction.model.Correction;

public interface CorrectionRepository extends JpaRepository<Correction, Long> {
}
