package com.tai.backend.dto;

public class AddExpenseRequest {
   private String expenseName;
   private int expenseAmount;

   public String getExpenseName() {
    return expenseName;
   }

   public int getExpenseAmount() {
    return expenseAmount;
   }

   public void setExpenseName(String expenseName) {
    this.expenseName = expenseName;
   }

   public void setExpenseAmount(int expenseAmount) {
    this.expenseAmount = expenseAmount;
   }
}
