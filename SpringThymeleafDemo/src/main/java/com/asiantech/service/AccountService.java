package com.asiantech.service;

import java.util.List;

import com.asiantech.model.Account;

public interface AccountService {
	public static String NAME = "accountService";

	// CRUD operations

	// Save or Update
	public void save(Account account);

	// Read
	public Account getById(int id);

	// Delete
	public void deleteById(int id);

	// Get All
	public List<Account> getAll();

	// Get Limit offset
	public List<Account> getLimit(int limit, int off);

	// Get Count rows
	public int getCount();

	// Search Account
	public List<Account> search(String name);
	
	// Get Number Paging
	public int getNumPagination(int maxRows) ;
}
