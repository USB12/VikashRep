package com.nt.map.lagacy;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Propertiesdemo2 {
	public static void main(String[] args)throws SQLException,Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("src/com/nt/map/lagacy/db.properties");
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String pwd=p.getProperty("pwd");
      Connection con=DriverManager.getConnection(url,user,pwd);
	}

}
