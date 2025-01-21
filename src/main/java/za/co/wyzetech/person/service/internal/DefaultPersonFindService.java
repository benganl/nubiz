package za.co.wyzetech.person.service.internal;

import za.co.wyzetech.api.BaseService;
import za.co.wyzetech.person.infrastructure.PersonRepository;
import za.co.wyzetech.person.service.PersonFindService;

@BaseService("defaultPersonFindService")
public class DefaultPersonFindService implements PersonFindService {
  private final PersonRepository personRepository;

  public DefaultPersonFindService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  
}
