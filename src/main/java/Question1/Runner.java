package Question1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main( String[] args ) {
		
		ApplicationContext context =
        		new ClassPathXmlApplicationContext("Question1/config.xml");
			
		Employee empData = (Employee) context.getBean("emp1");
        System.out.println(empData);		
	}
}