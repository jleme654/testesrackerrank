package br.com.hackerrank.day13;

public class MyBook extends Book {
	
	private int price;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.price =price;
	}

	@Override
	void display() {
		System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price);
	}

}
