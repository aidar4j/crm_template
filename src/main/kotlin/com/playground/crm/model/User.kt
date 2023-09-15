package com.playground.crm.model

import com.playground.crm.model.enums.Gender
import com.playground.crm.model.enums.Role
import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "users")
class User(

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,

  @Column(nullable = false)
  val name: String,

  @Column(nullable = false)
  val email: String,

  @Column(nullable = false)
  val gender: Gender,

  @Column(nullable = false)
  val dob: Date,

  @Column(nullable = false)
  val role: Role
)