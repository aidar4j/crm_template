package com.playground.crm.model

import com.playground.crm.model.enums.Gender
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

class Customer(

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,

  @Column(name = "first_name")
  val firstName: String,

  @Column(name = "last_name")
  val lastName: String,

  @Column(name = "gender")
  val gender: Gender,

  @Column(name = "dob")
  val dob: Date
)