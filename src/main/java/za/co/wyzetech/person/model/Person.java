package za.co.wyzetech.person.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import za.co.wyzetech.api.Model;

@Setter
@Getter
@Entity
@Table(name = "person")
public class Person extends Model {
  private PersonType personType;
  private IdentificationType identificationType;
}
