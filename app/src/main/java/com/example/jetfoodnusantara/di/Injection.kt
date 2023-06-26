package com.example.jetfoodnusantara.di

import com.example.jetfoodnusantara.data.FoodRepository

object Injection {
    fun provideRepository(): FoodRepository {
        return FoodRepository.getInstance()
    }
}