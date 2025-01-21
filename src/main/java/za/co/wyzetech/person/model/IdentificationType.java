package za.co.wyzetech.person.model;

import lombok.Getter;

@Getter
public enum IdentificationType {
  ID(100), PASSPORT(101), BUSINESS_REG_NUMBER(102);

  private final Integer code;

  IdentificationType(Integer code) {
    this.code = code;
  }

  public static IdentificationType of(Integer code) {
    for(IdentificationType value : IdentificationType.values()) {
      if(value.code.equals(code)) return value;
    }
    throw new RuntimeException("Could not find IdentificationType by code.");
  }
}
