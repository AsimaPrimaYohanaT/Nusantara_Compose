package com.example.jetfoodnusantara.data

import com.example.jetfoodnusantara.model.Food
import com.example.jetfoodnusantara.model.FoodData

class FoodRepository {
    fun getFood(): List<Food> {
        return FoodData.food
    }

    fun searchFood(query: String): List<Food>{
        return FoodData.food.filter{
            it.name.contains(query,ignoreCase = true)
        }
    }

    fun getFoodById(foodId: Long): Food {
        return FoodData.food.first {
            it.id.equals(foodId)
        }
    }

    companion object {
        @Volatile
        private var instance: FoodRepository? = null

        fun getInstance(): FoodRepository =
            instance ?: synchronized(this) {
                FoodRepository().apply {
                    instance = this
                }
            }
    }
}