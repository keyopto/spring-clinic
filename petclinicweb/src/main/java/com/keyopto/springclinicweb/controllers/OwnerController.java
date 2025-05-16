package com.keyopto.springclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

  @RequestMapping({"", "/"})
  public String getList() {
    return "owners/index";
  }
}
