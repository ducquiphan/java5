package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.BooksOfAccount;

public interface BooksOfAccountDAO extends JpaRepository<BooksOfAccount, Long>{
	@Override
	@Query("select o from BooksOfAccount o where o.isActive = true")
	List<BooksOfAccount> findAll();
}
