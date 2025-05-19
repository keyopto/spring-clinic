package com.keyopto.springclinic.services.map;

import com.keyopto.springclinic.models.Owner;
import com.keyopto.springclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Long, Owner> implements OwnerService {

  @Override
  public Owner save(Owner object) {
    super.save(object.getId(), object);
    return object;
  }

  @Override
  public Owner findByLastName() {
    throw new UnsupportedOperationException("Unimplemented method 'findByLastName'");
  }
}
