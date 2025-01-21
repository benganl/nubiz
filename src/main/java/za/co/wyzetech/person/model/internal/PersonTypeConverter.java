package za.co.wyzetech.person.model.internal;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;
import za.co.wyzetech.person.model.PersonType;

@Converter(autoApply = true)
public class PersonTypeConverter implements AttributeConverter<PersonType, Integer> {

  @Override
  public Integer convertToDatabaseColumn(PersonType attribute) {
    if (Objects.isNull(attribute)) {
      return null;
    }
    return attribute.getCode();
  }

  @Override
  public PersonType convertToEntityAttribute(Integer code) {
    if (Objects.isNull(code)) {
      return null;
    }

    return Stream.of(PersonType.values())
        .filter(c -> c.getCode().equals(code))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
