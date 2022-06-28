package com.codingdojo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.models.Book;
import com.codingdojo.repositories.BookRepository;

@Service
public class BookService
{
	@Autowired
	private BookRepository bookRepository;
	
	public void create(Book book)
	{
		bookRepository.save(book);
	}

	public void update(Book book)
	{
		bookRepository.save(book);
	}
	
	public ArrayList<Book> findAll()
	{
		return bookRepository.findAll();
	}
	
	public Book findById(Long id)
	{
		return bookRepository.findById(id).orElse(null);
	}
	
	public void deleteById(Long id)
	{
		bookRepository.deleteById(id);
	}
};