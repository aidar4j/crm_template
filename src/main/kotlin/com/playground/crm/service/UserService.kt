package com.playground.crm.service

import com.playground.crm.controller.dto.CreateUserDto
import com.playground.crm.controller.dto.ReadUserDto
import com.playground.crm.model.User
import com.playground.crm.repository.UserRepository
import org.springframework.stereotype.Service

interface UserService {
  fun getAll(): List<ReadUserDto>
  fun save(dto: CreateUserDto): User
}

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

  override fun getAll(): List<ReadUserDto> {
    val users = userRepository.findAll()

    return users.map {
      ReadUserDto(
        name = it.name,
        email = it.email,
        gender = it.gender,
        dob = it.dob,
        role = it.role
      )
    }
  }

  override fun save(dto: CreateUserDto): User {
    val user = User(
      name = dto.name,
      email = dto.email,
      gender = dto.gender,
      dob = dto.dob,
      role = dto.role
    )

    return userRepository.save(user)
  }

}