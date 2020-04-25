package com.nt.map.lagacy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args)throws Exception {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("src/com/nt/map/lagacy/abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("vikas");
		System.out.println(s);
		p.setProperty("khushi", "2000");
		FileOutputStream fos=new FileOutputStream("src/com/nt/map/lagacy/abc.properties");
		p.store(fos, "update by developer for scjp properties");
	}

}
