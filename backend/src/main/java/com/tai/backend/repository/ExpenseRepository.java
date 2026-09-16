package com.tai.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tai.backend.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    
}
