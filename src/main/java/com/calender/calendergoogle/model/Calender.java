package com.calender.calendergoogle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @author Modassir Ali
 * @created 05/01/24 12:43 pm
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "calender")
@Entity
public class Calender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calenderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "calender")
    private List<Event> eventList;
}
