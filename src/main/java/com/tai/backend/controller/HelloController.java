package com.tai.backend.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tai.backend.dto.AddExpenseRequest;
import com.tai.backend.service.ExpensesService;

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
    public Map<String, Integer> expenses() {
        return expensesService.getExpenses();
    }

    @GetMapping("/expenses/{name}")
    public Map.Entry<String, Integer> expenses(@PathVariable String name) {
        return expensesService.getExpense(name);
    }

    @DeleteMapping("/expenses/{name}")
    public String deleteExpense(@PathVariable String name) {
        return expensesService.deleteExpense(name);
    } 
}