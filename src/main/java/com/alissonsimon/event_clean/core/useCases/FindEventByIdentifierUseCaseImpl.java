package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.gateway.EventGateway;
import com.alissonsimon.event_clean.infra.exception.NotFoundEventException;

public class FindEventByIdentifierUseCaseImpl implements FindEventByIdentifierUseCase {
    private final EventGateway gateway;

    public FindEventByIdentifierUseCaseImpl(EventGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Event execute(String identifier) {
        return gateway.findEventByIdentifier(identifier)
                .orElseThrow(() -> new NotFoundEventException("Identifier " + identifier + " not found."));
    }
}
