package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		// call the static method
		List<Book> books = BookDetails.showBooks();
		return books;
	}

	@Override
	public Book getById(int bookId) {
//		get the list of books
		List<Book> books = BookDetails.showBooks();
//		iterate thru the books
		for (Book book : books) {
//		get the bookId and check if it matches the bookId in parameter
			if (book.getBookId() == bookId)
//				if yes return the book object
				return book;
		}
		// throw exception - outside for loop
		throw new BookNotFoundException("invalid id");
	}

	@Override
	public List<Book> getByTitleContains(String title) {
//		get the list of books
		List<Book> books = BookDetails.showBooks();
//		create a temporary array
		List<Book> booksByTitle = new ArrayList<>();
//		iterate thru the original books list
		for (Book book : books) {
//		get the title and check if it is in the list
			if (book.getTitle().contains(title))  // checking for title like java
//				if yes add the book to the temporary list
				booksByTitle.add(book);
		}
		// throw exception - outside for loop - if list is empty
		if(booksByTitle.isEmpty()) {
			throw new BookNotFoundException("book containing this title does not exist");
		 }
		// return the temp list booksByTitle
		return booksByTitle;
	}

	@Override
	public List<Book> getByAuthCategory(String author, String category) {
//		get the list of books
		List<Book> books = BookDetails.showBooks();
//		create a temporary array
		List<Book> booksByAuth = new ArrayList<>();
//		iterate thru the original books list
		for (Book book : books) {
//		get the author and category and check if it is in the list
			if (book.getAuthor().equalsIgnoreCase(author) && book.getCategory().equalsIgnoreCase(category))  
//				if yes add the book to the temporary list
				booksByAuth.add(book);
		}
					
		// throw exception - outside for loop - if list is empty
		if(booksByAuth.isEmpty()) {
			throw new BookNotFoundException("book with this auth in category does not exist");
		 }
		return booksByAuth;
	}

	@Override
	public List<Book> getByLesserPrice(double price) {
//		get the list of books
		List<Book> books = BookDetails.showBooks();
//		create a temporary array
		List<Book> booksByLesserPrice = new ArrayList<>();
//		iterate thru the original books list
		for (Book book : books) {
//		get the price and check if it is lesser than the price given
			if (book.getPrice()<price)  
//				if yes add the book to the temporary list
				booksByLesserPrice.add(book);
		}
		// throw exception - outside for loop - if list is empty
		if(booksByLesserPrice.isEmpty()) {
			throw new BookNotFoundException("book with this auth in category does not exist");
		 }
		return booksByLesserPrice;
	}

}
