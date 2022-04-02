package com.parul.bootcamp.project.controller;

import com.parul.bootcamp.project.entities.enums.OrderStatusEnum;
import com.parul.bootcamp.project.repos.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  public void show(){
    List<OrderStatusEnum> statusEnums = OrderStatusEnum.fromToMapping().get(OrderStatusEnum.CANCELLED);

  }

}
