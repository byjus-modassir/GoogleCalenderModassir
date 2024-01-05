package com.calender.calendergoogle.model;

import com.calender.calendergoogle.model.enums.TAGS;
import com.calender.calendergoogle.model.enums.VISIBLITY;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Modassir Ali
 * @created 05/01/24 12:45 pm
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user")
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private VISIBLITY visiblity;

    @ManyToOne
    @JoinColumn(name = "calendar_id")
    private Calender calender;

    private Long startTime;

    private Long endTime;

    private String location;

    private String eventName;

    private String description;

    private TAGS tags;

    @OneToMany
    private List<User> attendees;
}
