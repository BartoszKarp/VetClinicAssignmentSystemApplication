package pl.bkarp.vetclinicassignmentsystem.domain.vet;

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
public class Vet {

    @Id
    @GeneratedValue
    private UUID id;

    String name;

    String lastName;

}
