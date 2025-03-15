package com.vocafix.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vocafix.video.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
