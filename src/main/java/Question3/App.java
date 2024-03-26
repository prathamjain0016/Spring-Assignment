package Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

@Component
public class App 
{
	private Triangle triangle;
	@Autowired
	public App(Triangle triangle) {
		this.triangle=triangle;
	}
    public static void main( String[] args )
    {
        System.out.println("Annotation-Based Configuration for the Triangle Bean in Spring");
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        App app = context.getBean(App.class);
        System.out.println("Area : " + app.triangle.calculateArea());
    }
}