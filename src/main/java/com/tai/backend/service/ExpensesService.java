package com.tai.backend.service;

import com.tai.backend.dto.AddExpenseRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
    private Map<String, Integer> expenses = new HashMap<>();

    public Map<String,Integer> getExpenses() {
        return expenses;
    }

    public void addExpense(AddExpenseRequest request) {
        expenses.put(request.getExpenseName(), request.getExpenseAmount());
    }

    public Map.Entry<String,Integer> getExpense(String name) {
        if (expenses.containsKey(name)) {
            return Map.entry(name, expenses.get(name));
        }
        return null;
    }

    public String deleteExpense(String name) {
        if (expenses.containsKey(name)) {
            expenses.remove(name);
            return "Successfully deleted";
        }
        return null;
    }
}
