package com.ox.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ox.bank.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

}
