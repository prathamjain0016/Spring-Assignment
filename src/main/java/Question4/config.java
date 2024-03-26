package Question4;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"Question4","Question4.Aspect"})
public class config {
    @Bean
    public TriangleClass triangle() {
    	return new TriangleClass();
    }
}