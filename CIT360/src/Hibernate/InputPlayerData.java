import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class InputPlayerData {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Player addPlayer = new Player();
        addPlayer.setPlayerfn("Derek");
        addPlayer.setPlayerln("Clawson");
        addPlayer.setPlayerun("number1coolguy");
        addPlayer.setPlayeremail("derekclawson@gmail.com");

        session.save(addPlayer);
        transaction.commit();

        System.out.println("Player data successfully added.");

    }
}