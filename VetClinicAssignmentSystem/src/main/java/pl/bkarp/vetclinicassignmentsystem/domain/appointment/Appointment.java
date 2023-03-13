package pl.bkarp.vetclinicassignmentsystem.domain.appointment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "appointments")
@ToString
@Setter
@Getter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private LocalDateTime bookingTime = LocalDateTime.now();

    private LocalDateTime appointmentStartTime;

    private LocalDateTime appointmentEndTime;

}
