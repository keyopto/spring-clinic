package com.keyopto.springclinicdata.services.map;

import com.keyopto.springclinicdata.models.Pet;
import com.keyopto.springclinicdata.services.CrudService;

public class PetMapService extends AbstractMapService<Long, Pet> implements CrudService<Long, Pet> {

  @Override
  public Pet save(Pet object) {
    super.save(object.getId(), object);
    return object;
  }
}
