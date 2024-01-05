package com.calender.calendergoogle.service;

import com.calender.calendergoogle.model.Calender;
import com.calender.calendergoogle.model.Event;
import com.calender.calendergoogle.model.User;
import com.calender.calendergoogle.pojo.CreateEventRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 * @author Modassir Ali
 * @created 05/01/24 12:53 pm
 */

@Service
public class EventService implements IEventService{

    @Override
    public String createEvent(final CreateEventRequest createEventRequest) {

        Calender calendar = getCalendarById(createEventRequest.getCalenderId());
        if (Objects.isNull(calendar)) {
            throw new IllegalArgumentException("Invalid calendarId: " + createEventRequest.getCalenderId());
        }
        List<User> attendees = getAttendeesByIds(createEventRequest.getAttendees());
        Event event = Event.builder()
                .calender(calendar)
                .eventName(createEventRequest.getEventName())
                .startTime(createEventRequest.getStartTime())
                .endTime(createEventRequest.getEndTime())
                .tags(createEventRequest.getTags())
                .location(createEventRequest.getLocation())
                .attendees(attendees)
                .build();

        //save event in DB
        return "Saved successfully";
    }

    private List<User> getAttendeesByIds(final List<String> userIds) {
        return new ArrayList<>(List.of(dummyUser()));
    }

    private Calender getCalendarById(final Long id) {
        return createDummyCalender();
    }

    private Calender createDummyCalender() {
        return Calender.builder()
                .calenderId(1L)
                .eventList(new ArrayList<>())
                .user(dummyUser())
                .build();
    }

    private User dummyUser() {
        return User.builder()
                .userId(1l)
                .name("Dummy")
                .password("password")
                .email("alimodassir@gmail.com")
                .build();
    }

    //satyammishra2508@gmail.com
}
