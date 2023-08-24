package com.mayuratech.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankCustomer")
public class BankCustomer {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column(name = "accountNumber" )
		private String accountNumber;
		
		@Column(name = "balance")
		private double balance;

		public BankCustomer(int id, String accountNumber, double balance) {
			this.id = id;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		public BankCustomer() {
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "BankCustomer [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
		}
	}



	//Create a bank account details service application using Hibernate. Perform CRUD operations like
	//Add new customer details, 
	//Get customer details, 
	//Get customer detail based on account number, 
	//Delete specific account if the balance is less than 100 & 
	//Update the account balance whenever the user withdraws the amount or deposit the amount."




	// @Embeddable combine with entity table


