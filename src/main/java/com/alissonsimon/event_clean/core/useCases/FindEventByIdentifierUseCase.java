package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;

public interface FindEventByIdentifierUseCase {
    public Event execute(String identifier);
}
