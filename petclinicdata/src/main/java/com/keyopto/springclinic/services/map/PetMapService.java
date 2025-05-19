package com.keyopto.springclinic.services.map;

import com.keyopto.springclinic.models.Pet;
import com.keyopto.springclinic.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Long, Pet> implements CrudService<Long, Pet> {

  @Override
  public Pet save(Pet object) {
    super.save(object.getId(), object);
    return object;
  }
}
