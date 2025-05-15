package com.keyopto.springclinicdata.services;

import com.keyopto.springclinicdata.models.Pet;
import java.util.Set;

public interface PetService {
  public Set<Pet> findAll();

  public Pet findById(Long id);
}
