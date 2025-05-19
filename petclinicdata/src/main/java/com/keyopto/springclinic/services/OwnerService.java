package com.keyopto.springclinic.services;

import com.keyopto.springclinic.models.Owner;

public interface OwnerService extends CrudService<Long, Owner> {
  public Owner findByLastName();
}
