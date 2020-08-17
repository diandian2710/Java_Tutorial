package com.in28minutes.oops.level2;

public class BookRunner {
    public static void main(String[] args) {
        NewBook book = new NewBook(123, "Objected Oriented Programming with Java", "Range");
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(101, "Awesome", 5));
        System.out.println(book);
    }
}
