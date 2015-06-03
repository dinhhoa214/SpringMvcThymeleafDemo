package com.asiantech.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;   

import com.asiantech.model.Account;
  
public class AccountExtractor implements ResultSetExtractor<Account> {  
  
 public Account extractData(ResultSet resultSet) throws SQLException,  
   DataAccessException {  
    
  Account account = new Account();  
    
  account.setId(resultSet.getInt(1));
  account.setName(resultSet.getString(2)); 
  account.setTime(resultSet.getString(3));
  account.setStatus(resultSet.getString(4));
  account.setIsPublic(resultSet.getString(5));
  return account;  
 }  
}
