package com.keyopto.springclinicdata.services.map;

import com.keyopto.springclinicdata.models.Owner;
import com.keyopto.springclinicdata.services.CrudService;

public class OwnerMapService extends AbstractMapService<Long, Owner>
    implements CrudService<Long, Owner> {

  @Override
  public Owner save(Owner object) {
    super.save(object.getId(), object);
    return object;
  }
}
