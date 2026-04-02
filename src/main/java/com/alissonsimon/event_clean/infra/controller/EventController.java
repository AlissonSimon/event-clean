package com.alissonsimon.event_clean.infra.controller;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.useCases.CreateEventUseCase;
import com.alissonsimon.event_clean.core.useCases.FindEventsUseCase;
import com.alissonsimon.event_clean.infra.dto.EventRequest;
import com.alissonsimon.event_clean.infra.dto.EventResponse;
import com.alissonsimon.event_clean.infra.mapper.EventDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {
    private final FindEventsUseCase findEventsUseCase;
    private final CreateEventUseCase createEventUseCase;
    private final EventDtoMapper mapper;

    @GetMapping
    public List<EventResponse> findEvents() {
        return findEventsUseCase.execute()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public EventResponse createEvent(@RequestBody EventRequest request) {
        Event newEvent = createEventUseCase.execute(mapper.toDomain(request));
        return mapper.toDto(newEvent);
    }
}
