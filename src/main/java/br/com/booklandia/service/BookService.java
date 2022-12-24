package br.com.booklandia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.booklandia.model.BookEntity;
import br.com.booklandia.repository.BookRepository;
import jakarta.validation.Valid;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookEntity saveBook(BookEntity bookEntity) {
		return this.bookRepository.save(bookEntity);
	}

	public BookEntity delete(@Valid Long id) {
		return null;
	}

}
