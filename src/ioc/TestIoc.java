package ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	@Test
	public void testUser() {
//		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
//		
//		User user=(User)context.getBean("user");
//		
//		System.out.println(user);
//		user.add();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		
		UserService userService=(UserService)context.getBean("userService");
		userService.add();
		
		((UserService)null).add();
	}
}
