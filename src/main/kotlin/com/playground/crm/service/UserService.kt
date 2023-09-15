package com.playground.crm.service

import com.playground.crm.controller.dto.CreateUserDto
import com.playground.crm.model.User
import com.playground.crm.repository.UserRepository
import org.springframework.stereotype.Service

interface UserService {
  fun getAll(): List<User>
  fun save(dto: CreateUserDto): User
}

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

  override fun getAll(): List<User> = userRepository.findAll()

  override fun save(dto: CreateUserDto): User {
    val user = User(
      name = dto.name,
      email = dto.email,
      gender = dto.gender,
      dob = dto.dob
    )

    return userRepository.save(user)
  }

}