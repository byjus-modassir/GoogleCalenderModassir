package com.calender.calendergoogle.service;

import com.calender.calendergoogle.pojo.CreateEventRequest;

/**
 * @author Modassir Ali
 * @created 05/01/24 12:50 pm
 */

public interface IEventService {

    String createEvent(final CreateEventRequest createEventRequest);
}
