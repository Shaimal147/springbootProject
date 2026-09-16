package com.tai.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Expense {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String expenseName;
    private int expenseAmount;

    public Long getId() {
        return id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public int getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName =  expenseName;
    }
    
    public void setExpenseAmount(int expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
