package com.alissonsimon.event_clean.core.useCases;

import com.alissonsimon.event_clean.core.domain.Event;
import com.alissonsimon.event_clean.core.gateway.EventGateway;

import java.util.List;

public class FindEventsUseCaseImpl implements FindEventsUseCase {
    private final EventGateway gateway;

    public FindEventsUseCaseImpl(EventGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Event> execute() {
        return gateway.findEvents();
    }
}
