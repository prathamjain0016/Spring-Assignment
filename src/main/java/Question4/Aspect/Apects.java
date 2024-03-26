package Question4.Aspect;




import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Apects {

    @Around("execution(* Question4.TriangleClass.draw())")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    	
        long initial_time = System.currentTimeMillis();
        Object exec_time = joinPoint.proceed();
        long final_time = System.currentTimeMillis();
        long total_time_taken = final_time - initial_time;
        System.out.println("Total time  : " + total_time_taken + " ms");
        return exec_time;
    }
}
