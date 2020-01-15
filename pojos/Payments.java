package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Payments {

	
	private Integer	id;              
	private Users user;           
	private double amount ;       
	private PaymentType type ;  
	private LocalDate transaction_time ;  
	private LocalDate nextpayment_duedate;
	
	public Payments() {
		System.out.println("inside Payment ctor..");
	}

	public Payments( double amount, PaymentType type, LocalDate transaction_time,
			LocalDate nextpayment_duedate) {
		super();
		
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}

	public LocalDate getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(LocalDate transaction_time) {
		this.transaction_time = transaction_time;
	}

	public LocalDate getNextpayment_duedate() {
		return nextpayment_duedate;
	}

	public void setNextpayment_duedate(LocalDate nextpayment_duedate) {
		this.nextpayment_duedate = nextpayment_duedate;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", amount=" + amount + ", type=" + type + ", transaction_time=" + transaction_time
				+ ", nextpayment_duedate=" + nextpayment_duedate + "]";
	}
	
	
}
