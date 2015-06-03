package com.asiantech.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  

import org.springframework.jdbc.core.RowMapper;   

import com.asiantech.model.Account;
  
public class AccountRowMapper implements RowMapper<Account> {  
  
 public Account mapRow(ResultSet resultSet, int line) throws SQLException {  
  AccountExtractor accExtractor = new AccountExtractor();  
  return accExtractor.extractData(resultSet);  
 }  
  
}   
