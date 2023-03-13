package pl.bkarp.vetclinicassignmentsystem.domain.patient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
