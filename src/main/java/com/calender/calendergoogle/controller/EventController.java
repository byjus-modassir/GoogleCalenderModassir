package com.calender.calendergoogle.controller;

import com.calender.calendergoogle.pojo.CreateEventRequest;
import com.calender.calendergoogle.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Modassir Ali
 * @created 05/01/24 1:25 pm
 */

@RestController
@RequestMapping("/api/v1/calender")
public class EventController {


    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/createEvent")
    public String createEvent(final CreateEventRequest createEventRequest) {
        return eventService.createEvent(createEventRequest);
    }
}
