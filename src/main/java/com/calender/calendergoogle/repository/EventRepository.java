package com.calender.calendergoogle.repository;

import com.calender.calendergoogle.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Modassir Ali
 * @created 05/01/24 1:27 pm
 */

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
