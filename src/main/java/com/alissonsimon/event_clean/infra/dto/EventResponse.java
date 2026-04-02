package com.alissonsimon.event_clean.infra.dto;

import com.alissonsimon.event_clean.core.enums.EventType;

import java.time.LocalDateTime;

public record EventResponse(
        Long id,
        String name,
        String description,
        String identifier,
        String location,
        String organizer,
        Integer capacity,
        EventType type,
        LocalDateTime startedAt,
        LocalDateTime finishedAt
) {}
