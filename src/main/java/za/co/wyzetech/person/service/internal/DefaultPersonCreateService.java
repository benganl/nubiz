package za.co.wyzetech.person.service.internal;

import za.co.wyzetech.api.BaseService;
import za.co.wyzetech.person.infrastructure.PersonRepository;
import za.co.wyzetech.person.service.PersonCreateService;

@BaseService("defaultPersonCreateService")
public class DefaultPersonCreateService implements PersonCreateService {
  private final PersonRepository personRepository;

  public DefaultPersonCreateService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }


}
