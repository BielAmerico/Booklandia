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

	public BookEntity deleteBook(@Valid Long id) {
		return this.bookRepository.deleteById(id);
		System.out.println(">>> ID: " + id + " deletado com sucesso!");
		
	}
	public BookEntity findById(@Valid Long id) {
		System.out.println(">>> ID: "+ id + " buscado com sucesso!");
		return this.bookRepository.findById(id).get();
	}
	public BookEntity updateBook(BookEntity bookEntity) {
		return this.bookRepository.save(bookEntity);
	}

}
