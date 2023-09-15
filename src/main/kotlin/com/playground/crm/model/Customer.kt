package com.playground.crm.model

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

  @Column(name = "dob")
  val dob: Date
)