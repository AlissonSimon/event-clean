package com.alissonsimon.event_clean.infra.persistence;

import com.alissonsimon.event_clean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_events")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String identifier;
    private String location;
    private String organizer;
    private Integer capacity;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
}
