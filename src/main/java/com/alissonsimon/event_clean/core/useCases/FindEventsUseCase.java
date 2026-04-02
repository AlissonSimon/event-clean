package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;

import java.util.List;

public interface FindEventsUseCase {
    public List<Event> execute();
}
