package com.playground.crm.controller.dto

import com.playground.crm.model.enums.Gender
import com.playground.crm.model.enums.Role
import java.util.*

data class CreateUserDto(
  val name: String,
  val email: String,
  val gender: Gender,
  val dob: Date,
  val role: Role
)