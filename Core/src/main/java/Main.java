import DAO.SpringConfig;
import DAO.hbm.TypeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TypeDAO dao = context.getBean(TypeDAO.class);

        dao.readAll();
        System.out.println("Hello72");

    }
}
