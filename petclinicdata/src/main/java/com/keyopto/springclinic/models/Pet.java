package com.keyopto.springclinic.models;

import com.keyopto.springclinic.enums.PetType;
import java.time.LocalDate;

public class Pet extends BaseEntity {

  private PetType type;
  private Owner owner;
  private LocalDate birthDate;

  public Pet(PetType type, Owner owner, LocalDate birthDate) {
    super();
    this.type = type;
    this.owner = owner;
    this.birthDate = birthDate;
  }

  public PetType getType() {
    return type;
  }

  public void setType(PetType type) {
    this.type = type;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }
}
