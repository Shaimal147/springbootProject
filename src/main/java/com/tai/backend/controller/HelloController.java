package com.tai.backend.controller;

import java.util.Optional;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tai.backend.dto.AddExpenseRequest;
import com.tai.backend.service.ExpensesService;
import com.tai.backend.entity.Expense;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/home")
public class HelloController {
    private final ExpensesService expensesService;

    public HelloController( ExpensesService expensesService) {
        this.expensesService = expensesService;
    } 

    @GetMapping("")
    public String home() {
        return "home";
    }

    @PostMapping("/expenses")
    public void expenses(@RequestBody AddExpenseRequest request) {
        expensesService.addExpense(request);
    }

    @GetMapping("/expenses")
    public List<Expense> expenses() {
        return expensesService.getExpenses();
    }

    @GetMapping("/expenses/{id}")
    public Optional<Expense> expenses(@PathVariable Long id) {
        return expensesService.getExpense(id);
    }

    @DeleteMapping("/expenses/{id}")
    public String deleteExpense(@PathVariable Long id) {
        return expensesService.deleteExpense(id);
    } 
}