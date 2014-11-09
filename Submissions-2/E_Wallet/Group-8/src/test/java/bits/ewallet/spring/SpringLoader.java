/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bits.ewallet.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class SpringLoader {

	public ApplicationContext getJpaContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-data.xml");
		return context;
	}

}
