package za.co.wyzetech.person.model.internal;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Objects;
import java.util.stream.Stream;
import za.co.wyzetech.person.model.IdentificationType;

@Converter(autoApply = true)
public class PersonIdentificationTypeConverter implements
    AttributeConverter<IdentificationType, Integer> {

  @Override
  public Integer convertToDatabaseColumn(IdentificationType attribute) {
    if (Objects.isNull(attribute)) {
      return null;
    }
    return attribute.getCode();
  }

  @Override
  public IdentificationType convertToEntityAttribute(Integer code) {
    if (Objects.isNull(code)) {
      return null;
    }

    return Stream.of(IdentificationType.values()).filter(c -> c.getCode().equals(code)).findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }
}
