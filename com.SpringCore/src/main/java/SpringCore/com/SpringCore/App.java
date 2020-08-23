package SpringCore.com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Springcore.javaconfig.JavaConfig;
import com.Springcore.javaconfig.Students;
import com.Springcore.lifecycle.Samosa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
      Students s =  (Students) context.getBean("getStudent",Students.class);
   
    System.out.println(s.getName());
    System.out.println(s);
    }
}
