package com.expensetrackerapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseController {

    @GetMapping("/expenses")
    fun getExpenses():List<String>{
        return listOf("1","2","3","4","5","6","7","8","9")
    }

}
