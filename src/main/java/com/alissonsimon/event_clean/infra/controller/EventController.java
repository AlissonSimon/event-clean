package com.alissonsimon.event_clean.infra.controller;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.useCases.CreateEventUseCase;
import com.alissonsimon.event_clean.core.useCases.FindEventsUseCase;
import com.alissonsimon.event_clean.infra.dto.EventRequest;
import com.alissonsimon.event_clean.infra.dto.EventResponse;
import com.alissonsimon.event_clean.infra.mapper.EventDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventRequest request) {
        Event newEvent = createEventUseCase.execute(mapper.toDomain(request));
        Map<String, Object> response = new HashMap<>();
        response.put("Message", "Event created successful in database");
        response.put("Event data", mapper.toDto(newEvent));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
