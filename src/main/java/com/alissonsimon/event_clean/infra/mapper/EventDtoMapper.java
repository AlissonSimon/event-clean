package com.alissonsimon.event_clean.infra.mapper;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.infra.dto.EventRequest;
import com.alissonsimon.event_clean.infra.dto.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {
    public Event toDomain(EventRequest request) {
        return new Event(
                null,
                request.name(),
                request.description(),
                request.identifier(),
                request.location(),
                request.organizer(),
                request.capacity(),
                request.type(),
                request.startedAt(),
                request.finishedAt()
        );
    }

    public EventResponse toDto(Event event) {
        return new EventResponse(
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
}
