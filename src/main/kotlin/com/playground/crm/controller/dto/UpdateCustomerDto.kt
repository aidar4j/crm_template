package com.playground.crm.controller.dto

import com.playground.crm.model.enums.Gender
import java.util.*

class UpdateCustomerDto (
  val firstName: String,
  val lastName: String,
  val gender: Gender,
  val dob: Date
)