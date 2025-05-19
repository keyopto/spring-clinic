package com.keyopto.springclinic.controllers;

import com.keyopto.springclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"", "/"})
  public String getList(Model model) {
    model.addAttribute("owners", ownerService.findAll().toArray());

    return "owners/index";
  }
}
