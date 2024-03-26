package Question4;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {     
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        TriangleClass triangle = (TriangleClass) context.getBean(TriangleClass.class);
        triangle.setBase(29);
        triangle.setHeight(12);
        triangle.getArea(15,12);
        triangle.draw();
        context.close();
    }
}