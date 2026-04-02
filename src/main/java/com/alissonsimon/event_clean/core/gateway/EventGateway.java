package com.alissonsimon.event_clean.core.gateway;

import com.alissonsimon.event_clean.core.domain.Event;

import java.util.List;
import java.util.Optional;

public interface EventGateway {
    Event createEvent(Event event);
    List<Event> findEvents();
    boolean existsByIdentifier(String identifier);
    Optional<Event> findEventByIdentifier(String identifier);
}
