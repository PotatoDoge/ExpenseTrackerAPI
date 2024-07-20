package com.expensetrackerapi.controller

import com.expensetrackerapi.entity.dto.ExpenseDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseController {

    @PostMapping("/expense")
    fun addExpense(@RequestBody expenseDTO: ExpenseDTO): ResponseEntity<String> {
        return ResponseEntity(HttpStatus.CREATED);
    }

}
