package com.codingdojo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.models.Book;
import com.codingdojo.models.User;
import com.codingdojo.services.BookService;
import com.codingdojo.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController
{
	@Autowired
	private BookService bookService;
	
	@GetMapping("")
	public String bookAll( Model model )
	{
		model.addAttribute("books",bookService.findAll());
		return "book_all";
	}
	
	@GetMapping("/{id}/edit")
	public String bookEdit( @PathVariable("id") Long bookId, Model model, HttpSession session )
	{
		if(session.getAttribute("user")==null)
		{
			return "redirect:/books";
		}
		model.addAttribute("book",bookService.findById(bookId));
		return "book_edit";
	}
	
	@PostMapping("/{id}/edit")
	public String bookUpdate( @Valid @ModelAttribute("book") Book book, BindingResult res )
	{
		if(res.hasErrors())
		{
			return "book_edit";
		}
		bookService.update(book);
		return "redirect:/books";
	}

	@GetMapping("/new")
	public String bookNew( Model model, HttpSession session )
	{
		if(session.getAttribute("user")==null)
		{
			return "redirect:/books";
		}
		model.addAttribute("book",new Book());
		return "book_new";
	}
	
	@PostMapping("/new")
	public String bookCreate( @Valid @ModelAttribute("book") Book book, BindingResult res, HttpSession session )
	{
		if(res.hasErrors())
		{
			return "book_new";
		}
		bookService.create(book);
		return "redirect:/books";
	}
	
	@GetMapping("/{id}")
	public String bookShow( @PathVariable("id") Long bookId, Model model )
	{
		model.addAttribute("book",bookService.findById(bookId));
		return "book_show";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
};