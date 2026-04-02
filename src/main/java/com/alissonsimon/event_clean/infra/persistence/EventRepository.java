package com.alissonsimon.event_clean.infra.persistence;

import com.alissonsimon.event_clean.core.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
    Optional<Event> findEventByIdentifier(String identifier);
}
