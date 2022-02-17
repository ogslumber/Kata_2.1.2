import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld hw2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println("hw1 is hw2: " + (hw1 == hw2));
        System.out.println("cat1 is cat2: " + (cat1 == cat2));
    }
}