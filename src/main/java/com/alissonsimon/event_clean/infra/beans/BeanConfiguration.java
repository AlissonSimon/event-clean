package com.alissonsimon.event_clean.infra.beans;

import com.alissonsimon.event_clean.core.gateway.EventGateway;
import com.alissonsimon.event_clean.core.useCases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateEventUseCase createEvent(EventGateway eventGateway) {
        return new CreateEventUseCaseImpl(eventGateway);
    }

    @Bean
    public FindEventsUseCase findEvents(EventGateway eventGateway) {
        return new FindEventsUseCaseImpl(eventGateway);
    }

    @Bean
    public FindEventByIdentifierUseCaseImpl findEventByIdentifier(EventGateway eventGateway) {
        return new FindEventByIdentifierUseCaseImpl(eventGateway);
    }
}
