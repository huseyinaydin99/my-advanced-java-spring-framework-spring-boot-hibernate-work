package com.huseyinaydin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "database")
public class MySQLCustomerDal implements ICustomerDal {

	@Value("${database.connectionstring}")
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("MySQL veritabanına eklendi");
		System.out.println("Bağlantı ipi: " + this.connectionString);
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
