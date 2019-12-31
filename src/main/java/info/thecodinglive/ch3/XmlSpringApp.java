package info.thecodinglive.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import basic.ch3.WorkService;

public class XmlSpringApp {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		WorkService myWorkService = context.getBean("myWorkService", WorkService.class);
		myWorkService.askWork();
		
		WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
		yourWorkService.askWork();
		
		context.close();
	}
}
