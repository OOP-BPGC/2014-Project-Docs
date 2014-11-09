/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits.ewallet.repository;

import bits.ewallet.entity.Account;
import bits.ewallet.spring.SpringLoader;
import static junit.framework.Assert.assertEquals;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author amit
 */
public class AccountRepositoryTest {

	Account a = new Account();

	public void testClientRepository(){
		SpringLoader sl = new SpringLoader();
		ApplicationContext context = sl.getJpaContext();
		AccountRepository ar = context.getBean(AccountRepository.class);
		int size = ar.findAll().size();
		a.setAccountNumber("testAccNum");
		assertEquals(ar.saveAndFlush(a), a);
		assertEquals(ar.findOne(a.getId()).getAccountNumber(), "testAccNum");
		ar.delete(a);
		assertEquals(ar.findAll().size(), size);

	}

}
