package com.alissonsimon.event_clean.core.gateway;

import com.alissonsimon.event_clean.core.domain.Event;

import java.util.List;

public interface EventGateway {
    Event createEvent(Event event);
    List<Event> findEvents();
    boolean existsByIdentifier(String identifier);
}
