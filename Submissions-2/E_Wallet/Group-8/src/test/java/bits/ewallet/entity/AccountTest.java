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
public class AccountTest extends TestCase{

	Account a = new Account();
	public void testAccount(){
		a.setAccountNumber("accNo");
		a.setUniqueId("uniq");
		a.setBalance(500.0);
		Client c = new Client();
		assertEquals(a.getAccountNumber(), "accNo");
		assertEquals(a.getUniqueId(), "uniq");
		assertEquals(a.getBalance(), 500.0);
		assertEquals(a.getClient(), null);
		a.setClient(c);
		assertEquals(a.getClient(), c);
	}
}
