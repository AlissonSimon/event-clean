package com.alissonsimon.event_clean.infra.beans;

import com.alissonsimon.event_clean.core.gateway.EventGateway;
import com.alissonsimon.event_clean.core.useCases.CreateEventUseCase;
import com.alissonsimon.event_clean.core.useCases.CreateEventUseCaseImpl;
import com.alissonsimon.event_clean.core.useCases.FindEventsUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateEventUseCase createEvent(EventGateway eventGateway) {
        return new CreateEventUseCaseImpl(eventGateway);
    }

    @Bean
    public FindEventsUseCaseImpl findEvents(EventGateway eventGateway) {
        return new FindEventsUseCaseImpl(eventGateway);
    }
}
