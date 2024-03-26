package Question2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Question2/config.xml");

        MyMap myClass = context.getBean("myClass", MyMap.class);
        myClass.printMap();

        ((ClassPathXmlApplicationContext) context).close(); // Close the context when done
    }
}
