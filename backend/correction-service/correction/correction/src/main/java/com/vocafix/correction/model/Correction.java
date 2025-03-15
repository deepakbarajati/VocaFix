package com.vocafix.correction.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "corrections")
public class Correction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long transcriptionId;
    private String correctedText;
    private String status;  // "Processing", "Completed"
}
