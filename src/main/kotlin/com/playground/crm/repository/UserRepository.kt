package com.playground.crm.repository

import com.playground.crm.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
