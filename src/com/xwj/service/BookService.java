package com.xwj.service;

import java.util.List;

import com.xwj.dao.BookDao;
import com.xwj.domain.Book;

public class BookService {
	
	BookDao bookDao = new BookDao();

	public List<Book> getBookList(){
	  return bookDao.selectBookList();
	}
}
