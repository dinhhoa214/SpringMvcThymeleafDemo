package com.asiantech.service;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Repository; 

import com.asiantech.dao.AccountDao;
import com.asiantech.model.Account;  

@Repository(AccountService.NAME)
public class AccountServiceImpl implements AccountService{
	 
 	@Autowired 
	private AccountDao accdao;

	public void save(Account account) {
		accdao.save(account); 
	}

	public Account getById(int id) {
		Account account = accdao.getById(id);
		return account;
	}

	public void deleteById(int id) {
		accdao.deleteById(id); 
	}

	public List<Account> getAll() {
		List<Account> listAccount = accdao.getAll();
		 
		return listAccount;
	}

	public List<Account> getLimit(int limit, int off) {
		List<Account> listAccount = accdao.getLimit(limit, off); 
		return listAccount;
	}

	public int getCount() { 
		return accdao.getCount();
	}

	public List<Account> search(String name) {
		List<Account> listAccount = accdao.search(name);
		return listAccount;
	}

	public int getNumPagination(int maxRows) {
		int numRows, numPages;
		numRows = getCount();
		numPages = numRows / maxRows;
		if (numRows % maxRows != 0)
			numPages++;
		return numPages;
	}
	
	
}
