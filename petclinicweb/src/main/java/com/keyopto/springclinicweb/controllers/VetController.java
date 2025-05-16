package com.keyopto.springclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

  @RequestMapping({"/vets", "/vets/", "/vets/list"})
  String getList() {
    return "vets/index";
  }
}
