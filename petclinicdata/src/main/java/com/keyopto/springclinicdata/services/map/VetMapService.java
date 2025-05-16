package com.keyopto.springclinicdata.services.map;

import com.keyopto.springclinicdata.models.Vet;
import com.keyopto.springclinicdata.services.CrudService;

public class VetMapService extends AbstractMapService<Long, Vet> implements CrudService<Long, Vet> {
  @Override
  public Vet save(Vet object) {
    super.save(object.getId(), object);
    return object;
  }
}
