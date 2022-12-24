package br.com.booklandia.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class BookEntity implements Serializable{

	private static final long serialVersionUID = -8271601598424373902L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_book")
	public Long idBook;
	
	@Column(name = "name", unique = true)
	public String nameBook;
	
	public Integer releaseDate;
	
	public Integer numberPages;
	
	public String edition;
	
	public String publishingCompany;
	
	@Column(name = "language")
	public String languageBook;

	public BookEntity book;

	public Long getIdBook() {
		return idBook;
	}

	public void setIdBook(Long idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public Integer getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Integer releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(Integer numberPages) {
		this.numberPages = numberPages;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public String getLanguageBook() {
		return languageBook;
	}

	public void setLanguageBook(String languageBook) {
		this.languageBook = languageBook;
	}
	
	@JsonBackReference
	public BookEntity getBook() {
		return book;
	}
	
	public void setBook(BookEntity book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
