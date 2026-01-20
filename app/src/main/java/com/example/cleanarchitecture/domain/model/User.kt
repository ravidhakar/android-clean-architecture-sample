package com.example.cleanarchitecture.domain.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val profileImageUrl: String?,
    val createdAt: Long
)