package com.example.stream_schedule.model;

import java.time.LocalDateTime;

/**
 * we don't need private final variables
 * we don't need to worry about getters or constructos
 * we don't need about equal(), toHashCode() and toString()
 * it's all being taken care of in Java 17
 */
public record LiveStreamRecord(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {

    public String getTitle() {
        return title;
    }
}
