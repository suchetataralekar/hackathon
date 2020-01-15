package com.app.pojos;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class IssueRecord 
{
  private Integer id;
  private Copies copyId;
  private Users memberId;
  private LocalDate issueDate;
  private LocalDate returnDueDate;
  private LocalDate returnDate;
  private double fineAmount;
  
  public IssueRecord()
  {
	  
  }

public IssueRecord(LocalDate issueDate, LocalDate returnDueDate, LocalDate returnDate, double fineAmount) 
{
	super();
	this.issueDate = issueDate;
	this.returnDueDate = returnDueDate;
	this.returnDate = returnDate;
	this.fineAmount = fineAmount;
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
public Copies getCopyId() {
	return copyId;
}

public void setCopyId(Copies copyId) {
	this.copyId = copyId;
}
@OneToOne
public Users getMemberId() {
	return memberId;
}

public void setMemberId(Users memberId) {
	this.memberId = memberId;
}


public LocalDate getIssueDate() {
	return issueDate;
}

public void setIssueDate(LocalDate issueDate) {
	this.issueDate = issueDate;
}


public LocalDate getReturnDueDate() {
	return returnDueDate;
}

public void setReturnDueDate(LocalDate returnDueDate) {
	this.returnDueDate = returnDueDate;
}


public LocalDate getReturnDate() {
	return returnDate;
}

public void setReturnDate(LocalDate returnDate) {
	this.returnDate = returnDate;
}


public double getFineAmount() {
	return fineAmount;
}

public void setFineAmount(double fineAmount) {
	this.fineAmount = fineAmount;
}

@Override
public String toString() 
{
	return "IssueRecord [id=" + id + ", issueDate=" + issueDate + ", returnDueDate=" + returnDueDate + ", returnDate="
			+ returnDate + ", fineAmount=" + fineAmount + "]";
}
 

  
}
