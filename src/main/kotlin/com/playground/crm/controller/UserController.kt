package com.playground.crm.controller

import com.playground.crm.controller.dto.CreateUserDto
import com.playground.crm.model.User
import com.playground.crm.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(val userService: UserService) {

  @GetMapping
  fun getUsers(): List<User> {
    return userService.getAll()
  }

  @PostMapping
  fun save(@RequestBody dto: CreateUserDto): User {
    return userService.save(dto)
  }
}