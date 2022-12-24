package br.com.booklandia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.booklandia.model.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long>{

}
