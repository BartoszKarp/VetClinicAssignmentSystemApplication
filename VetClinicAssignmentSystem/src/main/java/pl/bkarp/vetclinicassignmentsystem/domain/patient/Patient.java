package pl.bkarp.vetclinicassignmentsystem.domain.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "appointments")
@ToString
@Setter
@Getter
public class Patient {

    @Id
    @GeneratedValue
    private UUID id;

    String ownerFullName;

    String petName;

    String petType;

    String petBreed;

    int petAge;

    String comments;

}
