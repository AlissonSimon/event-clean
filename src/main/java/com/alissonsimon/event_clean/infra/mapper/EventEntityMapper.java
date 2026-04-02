package com.alissonsimon.event_clean.infra.mapper;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.infra.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {
    public EventEntity toEntity(Event event) {
        return new EventEntity(
                event.id(),
                event.name(),
                event.description(),
                event.identifier(),
                event.location(),
                event.organizer(),
                event.capacity(),
                event.type(),
                event.startedAt(),
                event.finishedAt()
        );
    }

    public Event toDomain(EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getIdentifier(),
                eventEntity.getLocation(),
                eventEntity.getOrganizer(),
                eventEntity.getCapacity(),
                eventEntity.getType(),
                eventEntity.getStartedAt(),
                eventEntity.getFinishedAt()
        );
    }
}
