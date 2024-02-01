package com.xyz.first;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		ArrayList<String>list1=new ArrayList<String>();
		
		list1.add("model-1");
		list1.add("model-2");
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("electronic-1");
		list2.add("electronic-2");
		
		Category c1=new Category();
		c1.setCname("mobile");
		c1.setProductname(list1);
		
		Category c2=new Category();
		c2.setCname("electronics");
		c2.setProductname(list2);
		
		session.save(c1);
		session.save(c2);
		
		t.commit();
		
		session.close();
		
		System.out.println("DataInseretd...");
	}

}
