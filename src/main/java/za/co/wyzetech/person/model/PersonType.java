package za.co.wyzetech.person.model;

import lombok.Getter;

@Getter
public enum PersonType {
  NATURAL(200), LEGAL(201);

  public final Integer code;

  PersonType(Integer code) {
    this.code = code;
  }

  public static PersonType of(Integer description) {
    for (PersonType value : PersonType.values()) {
      if (value.code.equals(description)) {
        return value;
      }
    }
    throw new RuntimeException("Could not find PersonType by code");
  }
}
