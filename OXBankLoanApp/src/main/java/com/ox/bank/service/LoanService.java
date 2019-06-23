package com.ox.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ox.bank.entity.Loan;
import com.ox.bank.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	LoanRepository loanRepo;

	public String createLoan(Loan loan) {
		
		if(loanRepo.save(loan) != null)
			return "Loan Created!!Pending for Approval";
		else 
			return "Loan not created!! Please contact support team";
	}

}
