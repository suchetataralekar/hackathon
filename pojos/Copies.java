package com.app.pojos;

import javax.persistence.*;

@Entity
public class Copies
{
	private Integer id;
	private Books bookId;
	private int rack;
	private String status;
	private IssueRecord issRec;
	
	public Copies() {
		System.out.println("copies constructor");
	}

	public Copies(int rack, String status) {
		super();
		
		this.rack = rack;
		this.status = status;
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
     @ManyToOne
     @JoinColumn(name="bookId")
	public Books getBookId() {
		return bookId;
	}

	public void setBookId(Books bookId) {
		this.bookId = bookId;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}
	@Column(length=20)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToOne(mappedBy = "copyId", cascade = CascadeType.ALL,orphanRemoval = true)
	public IssueRecord getIssRec() {
		return issRec;
	}

	public void setIssRec(IssueRecord issRec) {
		this.issRec = issRec;
	}

	@Override
	public String toString() {
		return "Copies [id=" + id + ", bookId=" + bookId + ", rack=" + rack + ", status=" + status + "]";
	}
	
	
	
	

}
