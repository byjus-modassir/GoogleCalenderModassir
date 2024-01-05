package com.calender.calendergoogle.pojo;

import com.calender.calendergoogle.model.User;
import com.calender.calendergoogle.model.enums.TAGS;
import com.calender.calendergoogle.model.enums.VISIBLITY;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Modassir Ali
 * @created 05/01/24 12:51 pm
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateEventRequest {

    private VISIBLITY visiblity;

    private Long calenderId;

    private Long startTime;

    private Long endTime;

    private String location;

    private String eventName;

    private String description;

    private TAGS tags;

    private List<String> attendees;
}
