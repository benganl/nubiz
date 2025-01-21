package za.co.wyzetech.person.infrastructure;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import za.co.wyzetech.person.model.Person;

public interface PersonRepository extends JpaRepository<UUID, Person> {
}
