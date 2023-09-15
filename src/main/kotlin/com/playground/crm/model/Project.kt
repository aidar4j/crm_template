package com.playground.crm.model

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

class Project(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,

  @Column(name = "name")
  val name: String,

  @Column(name = "type")
  val type: String,

  @Column(name = "start_year")
  val startYear: String,

  @Column(name = "end_year")
  val endYear: String
)