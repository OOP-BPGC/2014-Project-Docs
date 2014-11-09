/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits.ewallet.repository;

import bits.ewallet.entity.Account;
import bits.ewallet.entity.TransactionRecord;
import bits.ewallet.spring.SpringLoader;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author amit
 */
public class TransactionRecordRepositoryTest extends TestCase{

	Account a = new Account();
	Account b = new Account();
	TransactionRecord ta = new TransactionRecord();
	TransactionRecord tb = new TransactionRecord();

	public void testClientRepository(){
		SpringLoader sl = new SpringLoader();
		ApplicationContext context = sl.getJpaContext();
		AccountRepository ar = context.getBean(AccountRepository.class);
		TransactionRecordRepository tr = context.getBean(TransactionRecordRepository.class);
		int sizeT = tr.findAll().size();
		int sizeA = ar.findAll().size();
		double amount = 100;
		a.setAccountNumber("transactA");
		a.setBalance(0.0);
		b.setAccountNumber("transactB");
		b.setBalance(0.0);
		ta.setAccount(a);
		ta.setAmount(amount);
		tb.setAccount(b);
		tb.setAmount(-amount);
		a.setBalance(a.getBalance()+amount);
		b.setBalance(b.getBalance()-amount);
		tr.saveAndFlush(ta);
		tr.saveAndFlush(tb);
		assertEquals(tr.findAll().size(), sizeT+2);
		assertEquals(ar.findAll().size(), sizeA+2);
		assertEquals(a.getBalance(), amount);
		assertEquals(b.getBalance(), -amount);
		tr.delete(ta);
		tr.delete(tb);
		ar.delete(a);
		ar.delete(b);
		assertEquals(tr.findAll().size(), sizeT);
		assertEquals(ar.findAll().size(), sizeA);

//		assertEquals(ar.saveAndFlush(a), a);
//		assertEquals(ar.findOne(a.getId()).getAccountNumber(), "testAccNum");
//		ar.delete(a);
//		assertEquals(ar.findAll().size(), size);

	}
}
