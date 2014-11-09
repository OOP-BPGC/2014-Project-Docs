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
public class TransactionRecordTest extends TestCase{

	TransactionRecord tr = new TransactionRecord();
	public void testTransactionRecord(){
		Account a = new Account();
		tr.setAmount(500.0);
		assertEquals(tr.getAmount(), 500.0);
		assertEquals(tr.getAccount(), null);
		tr.setAccount(a);
		assertEquals(tr.getAccount(), a);
	}
}
