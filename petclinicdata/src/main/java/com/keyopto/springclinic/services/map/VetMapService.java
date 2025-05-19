package com.keyopto.springclinic.services.map;

import com.keyopto.springclinic.models.Vet;
import com.keyopto.springclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Long, Vet> implements VetService {
  @Override
  public Vet save(Vet object) {
    super.save(object.getId(), object);
    return object;
  }
}
