package com.asiantech.dao;

import java.util.List;

import com.asiantech.model.Account;

public interface AccountDao {
	public static String NAME = "accountDao";

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
	public List<Account> getLimit(int limit,int off);
	
	// Get Count rows
	public int getCount();
	
	// Search Account
	public List<Account> search(String name);
}
