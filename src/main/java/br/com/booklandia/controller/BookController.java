package br.com.booklandia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.booklandia.model.BookEntity;
import br.com.booklandia.service.BookService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	public BookService bookService;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public BookEntity save(@RequestBody BookEntity bookEntity) {
		return this.bookService.saveBook(bookEntity);
	}

	@DeleteMapping("/id")
	@ResponseStatus(code = HttpStatus.OK)
	public BookEntity delete(@PathVariable @Valid Long id) {
		return this.bookService.deleteBook(id);
	}

	@GetMapping("/id")
	@ResponseStatus(code = HttpStatus.OK)
	public BookEntity findById(@PathVariable @Valid Long id) {
		return this.bookService.findById(id);
	}

	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public BookEntity update(@RequestBody BookEntity bookEntity) {
		return this.bookService.updateBook(bookEntity);
	}
}
