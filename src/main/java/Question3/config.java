package Question3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="Question3")
public class config{
	@Bean
    public Triangle triangle() {
        return new Triangle(30.47, 19.25);
    }
}