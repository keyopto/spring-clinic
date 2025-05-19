package com.keyopto.springclinic.bootstrap;

import com.keyopto.springclinic.models.Owner;
import com.keyopto.springclinic.models.Vet;
import com.keyopto.springclinic.services.map.OwnerMapService;
import com.keyopto.springclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerMapService ownerMapService;
  private final VetMapService vetMapService;

  public DataLoader(OwnerMapService ownerMapService, VetMapService vetMapService) {
    this.ownerMapService = ownerMapService;
    this.vetMapService = vetMapService;
  }

  @Override
  public void run(String... args) throws Exception {
    Owner owner = new Owner("joe", "biden");
    owner.setId(1L);

    ownerMapService.save(owner);

    Vet vet = new Vet("donald", "trump");
    vet.setId(1L);

    vetMapService.save(vet);
  }
}
