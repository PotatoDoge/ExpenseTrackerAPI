package com.expensetrackerapi.entity.dto

import lombok.Data
import java.time.LocalDate

@Data
data class ExpenseDTO(
    val title: String,
    val description: String,
    val amount: Double,
    val category: String,
    val transactionDate: LocalDate,
    val transactionType: String
)