package game;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        GameManagement obj = (GameManagement) context.getBean("gameManagement");
        obj.printNumOfGuesses();
        obj.runGame();

    }

}
