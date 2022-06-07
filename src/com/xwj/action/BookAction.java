package com.xwj.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.mysql.fabric.xmlrpc.base.Array;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xwj.domain.Book;
import com.xwj.service.BookService;

public class BookAction extends ActionSupport{

	private Book book = new Book();
	

	
	private BookService bookService = new BookService();

	
	public String execute() {
		
		ServletActionContext.getRequest().getSession().setAttribute("BookList", bookService.getBookList());
	
		return SUCCESS;
	}
	
}
