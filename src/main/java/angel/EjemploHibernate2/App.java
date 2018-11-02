package angel.EjemploHibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;

import com.colegiosecundario.model.Alumno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	  private static final SessionFactory ourSessionFactory;

	  static {
	    try {
	      Configuration configuration = new Configuration();
	      configuration.configure();

	      ourSessionFactory = configuration.buildSessionFactory();
	    } catch (Throwable ex) {
	      throw new ExceptionInInitializerError(ex);
	    }
	  }

	  public static Session getSession() throws HibernateException {
	    return ourSessionFactory.openSession();
	  }
	public static void main( String[] args ){
		   final Session session = getSession();
		// final Query query = session.createQuery("from " + entityName);
		Query query = session.createQuery("select * from alumno");
		
		List<Object> listDatos = query.list();
		for(Object o: listDatos) {
			System.out.println(o);
			System.out.println("hola");
		}
    }
}
