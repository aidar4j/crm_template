package com.playground.crm.service

import com.playground.crm.controller.dto.CreateCustomerDto
import com.playground.crm.controller.dto.ReadCustomerDto
import com.playground.crm.model.Customer
import com.playground.crm.repository.CustomerRepository
import org.springframework.stereotype.Service

interface CustomerService {
  fun getAll(): List<ReadCustomerDto>
  fun save(dto: CreateCustomerDto): Customer
}

@Service
class CustomerServiceImpl(val customerRepository: CustomerRepository) : CustomerService {
  override fun getAll(): List<ReadCustomerDto> {
    val customers = customerRepository.findAll()

    return customers.map { customer ->
      ReadCustomerDto(
        firstName = customer.firstName,
        lastName = customer.lastName,
        gender = customer.gender,
        dob = customer.dob
      )
    }
  }

  override fun save(dto: CreateCustomerDto): Customer {
    val customer = Customer(
      firstName = dto.firstName,
      lastName = dto.lastName,
      gender = dto.gender,
      dob = dto.dob
    )

    return customerRepository.save(customer)
  }

}