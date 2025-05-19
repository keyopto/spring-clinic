package com.keyopto.springclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

  @RequestMapping({"", "/"})
  String getList() {
    return "vets/index";
  }
}
