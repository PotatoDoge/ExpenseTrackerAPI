package com.expensetrackerapi.entity.internal

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.NoArgsConstructor
import java.time.LocalDate

@Entity
data class Expense(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val title: String,
    val description: String,
    val amount: Double,
    val category: String,
    val transactionDate: LocalDate,
    val transactionType: String
) {
    constructor() : this(null, "", "", 0.0, "", LocalDate.now(), "")
}