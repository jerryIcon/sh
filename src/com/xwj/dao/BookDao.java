package com.xwj.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.xwj.domain.Book;

public class BookDao {
	
	public List<Book> selectBookList(){
		Session session =  BaseDao.getSession();
		Transaction tr =  session.beginTransaction();
		Criteria cr =  session.createCriteria(Book.class);
		List<Book> bookList =  cr.list();
		tr.commit();
		BaseDao.closeSession();
		return bookList;
	}
}
