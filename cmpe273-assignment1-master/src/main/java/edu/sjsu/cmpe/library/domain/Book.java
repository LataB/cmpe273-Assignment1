package edu.sjsu.cmpe.library.domain;

import java.util.ArrayList;
import java.util.List;


public class Book {
    private long isbn;
    private String title;
    private  String  publicationDate;
    private  String language;
    private int numPages;
    private String status ="available";
    public List<Reviews> reviews;
    public ArrayList<Authors> authors;
   
   
   
	public ArrayList<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Authors> authors) {
		this.authors = authors;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	
    
    
    public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	
    

    // add more fields here


	/**
     * @return the isbn
     */
    public long getIsbn() {
	return isbn;
    }

    /**
     * @param isbn
     *            the isbn to set
     */
    public void setIsbn(long isbn) {
	this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }
}
