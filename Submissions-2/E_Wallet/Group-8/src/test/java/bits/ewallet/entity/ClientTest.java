/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits.ewallet.entity;

import junit.framework.TestCase;

/**
 *
 * @author amit
 */
public class ClientTest extends TestCase{

	Client c = new Client();
	public void testClient(){
		c.setUserName("test");
		c.setUniquePin("1234");
		c.setPassword("passwd");

		assertEquals(c.getUserName(), "test");
		assertEquals(c.getUniquePin(), "1234");
		assertEquals(c.getPassword(), "passwd");
		assertEquals(c.getChangeDate(), null);

	}
}
