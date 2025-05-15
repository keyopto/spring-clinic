package com.keyopto.springclinicdata.services;

import com.keyopto.springclinicdata.models.Owner;
import java.util.Set;

public interface OwnerService {

  Set<Owner> findAll();

  Owner findById(Long id);
}
