package info.inetslov.springcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		 //ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext ("spring.xml");
	ApplicationContext container= 
				new ClassPathXmlApplicationContext("classpath:info/inetslov/context/spring.xml");
		//container.getResource("classpath:info/inetslov/context/spring.xml");
//((AbstractApplicationContext) container).refresh();
		//((AbstractApplicationContext) container).close();
	Parent parent = container.getBean(Parent.class);
	System.out.println(parent);
	Addres addres = container.getBean(Addres.class);
	System.out.println(addres);
	//container.close();
	((AbstractApplicationContext) container).close();
	((AbstractApplicationContext) container).refresh();
	}
	
}
