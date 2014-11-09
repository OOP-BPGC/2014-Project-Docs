/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits.ewallet.repository;

import bits.ewallet.entity.Client;
import bits.ewallet.spring.SpringLoader;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author amit
 */
public class ClientRepositoryTest extends TestCase{

	Client c = new Client();

	public void testClientRepository(){
		SpringLoader sl = new SpringLoader();
		ApplicationContext context = sl.getJpaContext();
		ClientRepository cr = context.getBean(ClientRepository.class);
		int size = cr.findAll().size();
		c.setUserName("test user");
		assertEquals(cr.saveAndFlush(c), c);
		assertEquals(cr.findOne(c.getId()).getUserName(), "test user");
		cr.delete(c);
		assertEquals(cr.findAll().size(), size);

	}


}
