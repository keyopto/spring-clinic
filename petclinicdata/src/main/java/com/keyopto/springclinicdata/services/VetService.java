package com.keyopto.springclinicdata.services;

import com.keyopto.springclinicdata.models.Vet;
import java.util.Set;

public interface VetService {

  Set<Vet> findAll();

  Vet findById(Long id);
}
