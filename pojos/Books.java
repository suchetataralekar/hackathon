package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Books 
{
	
	private Integer id;
	private String name;
	private String author,subject;
	private double price;
	private int isbn;
	private  List<Copies>  copyId=new ArrayList<>();
	
	public Books() {
		
		System.out.println("books constructor");
	}

	public Books(String name, String author, String subject, double price, int isbn) {
		super();
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
		this.isbn = isbn;
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
  @Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20)
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(length=20)
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@OneToMany(mappedBy = "bookId", cascade = CascadeType.ALL, orphanRemoval = true)
 public List<Copies> getCopyId() {
		return copyId;
	}

	public void setCopyId(List<Copies> copyId) {
		this.copyId = copyId;
	}
	
	public void addCopies(Copies a)
	{
		copyId.add(a);
		a.setBookId(this);
	}
	public void removeCopies(Copies a)
	{
		copyId.remove(a);
		a.setBookId(null);
	}

	
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", subject=" + subject + ", price=" + price
				+ ", isbn=" + isbn + "]";
	}
	
	

}
