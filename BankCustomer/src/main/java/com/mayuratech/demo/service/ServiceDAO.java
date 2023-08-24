package com.mayuratech.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mayuratech.demo.entity.BankCustomer;
import com.mayuratech.demo.repository.BankRepository;

public class ServiceDAO {
	
	private BankRepository bankrepo;

	public ServiceDAO(BankRepository bankrepo) {
		this.bankrepo = bankrepo;
	}
	
	public void addCustomers(BankCustomer bankcustomer){
		try {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(bankcustomer);
        transaction.commit();
        session.close();
		}catch (Exception e) {
            e.printStackTrace();
            }
		}
		
    }


