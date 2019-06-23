package com.ox.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.entity.Loan;
import com.ox.bank.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@PostMapping("/createLoan")
	public ResponseEntity<String> createLoan(@RequestBody Loan loan){
		
		if(loanService.createLoan(loan).equalsIgnoreCase("Loan Created"))
			return new ResponseEntity<String>("Loan Created!!Pending for Approval",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Loan not created!! Please contact support team",HttpStatus.BAD_REQUEST);
	}

}
