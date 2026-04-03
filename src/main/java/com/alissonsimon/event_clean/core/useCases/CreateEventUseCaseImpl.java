package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.gateway.EventGateway;
import com.alissonsimon.event_clean.core.exception.DuplicateEventException;

public class CreateEventUseCaseImpl implements CreateEventUseCase {
    private final EventGateway eventGateway;

    public CreateEventUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        if (eventGateway.existsByIdentifier(event.identifier())) {
            throw new DuplicateEventException("Identifier number: " + event.identifier() + " already is in use in another event.");
        }

        return eventGateway.createEvent(event);
    }
}
