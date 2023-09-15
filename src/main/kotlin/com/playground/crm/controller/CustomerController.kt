package com.playground.crm.controller

import com.playground.crm.controller.dto.CreateCustomerDto
import com.playground.crm.controller.dto.ReadCustomerDto
import com.playground.crm.model.Customer
import com.playground.crm.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class CustomerController(val customerService: CustomerService) {

  @GetMapping
  fun getAll(): List<ReadCustomerDto> = customerService.getAll()

  @PostMapping
  fun save(@RequestBody dto: CreateCustomerDto): Customer = customerService.save(dto)

}