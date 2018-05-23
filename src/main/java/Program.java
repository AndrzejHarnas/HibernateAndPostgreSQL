import org.hibernate.Session;


public class Program
{

//private static final Logger logger = Logger.getLogger(Program.class);

    public static void main(String[] args) {

     Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();
HTableMapping user = new HTableMapping();
user.setUserName("hahaha");
user.setUserPassword("Dziala");
session.save(user);
session.getTransaction().commit();





    }
}
