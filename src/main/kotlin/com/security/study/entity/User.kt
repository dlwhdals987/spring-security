package com.security.study.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "USERS")
data class User (
    @Id
    var id: Long? = null,
    val account: String? = null,
    val password:String? = null
)