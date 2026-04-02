package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.gateway.EventGateway;

public class CreateEventUseCaseImpl implements CreateEventUseCase {
    private final EventGateway eventGateway;

    public CreateEventUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return eventGateway.createEvent(event);
    }
}
