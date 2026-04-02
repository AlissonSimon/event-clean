package com.alissonsimon.event_clean.infra.gateway;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.gateway.EventGateway;
import com.alissonsimon.event_clean.infra.mapper.EventEntityMapper;
import com.alissonsimon.event_clean.infra.persistence.EventEntity;
import com.alissonsimon.event_clean.infra.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {
    private final EventRepository repository;
    private final EventEntityMapper mapper;

    @Override
    public Event createEvent(Event event) {
        EventEntity entity = mapper.toEntity(event);
        EventEntity newEvent = repository.save(entity);
        return mapper.toDomain(newEvent);
    }

    @Override
    public List<Event> findEvents() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
