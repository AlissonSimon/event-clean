package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;

public interface CreateEventUseCase {
    public Event execute(Event event);
}
