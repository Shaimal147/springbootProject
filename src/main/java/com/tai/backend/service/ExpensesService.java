package com.tai.backend.service;

import com.tai.backend.dto.AddExpenseRequest;
import com.tai.backend.repository.ExpenseRepository;
import com.tai.backend.entity.Expense;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ExpensesService {

    private final ExpenseRepository expenseRepository;

    public ExpensesService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getExpenses() {
        return expenseRepository.findAll();
    }

    public void addExpense(AddExpenseRequest request) {
        Expense expense = new Expense();
        expense.setExpenseName(request.getExpenseName());
        expense.setExpenseAmount(request.getExpenseAmount());

        expenseRepository.save(expense);
    }

    public Optional<Expense> getExpense(Long id) {
        return expenseRepository.findById(id);
    }

    public String deleteExpense(Long id) {
        expenseRepository.deleteById(id);
        return "Successfully Deleted";
    }
}
