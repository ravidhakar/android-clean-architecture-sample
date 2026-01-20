package com.example.cleanarchitecture.data.remote.network

import com.example.cleanarchitecture.data.remote.dto.UserDto
import com.example.cleanarchitecture.data.remote.dto.ProductDto
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    
    @GET("users/{id}")
    suspend fun getUser(@Path("id") userId: String): Response<UserDto>
    
    @GET("products")
    suspend fun getProducts(
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): Response<List<ProductDto>>
    
    @POST("auth/login")
    suspend fun login(
        @Body credentials: Map<String, String>
    ): Response<UserDto>
    
    @POST("auth/register")
    suspend fun register(
        @Body userData: Map<String, String>
    ): Response<UserDto>
}