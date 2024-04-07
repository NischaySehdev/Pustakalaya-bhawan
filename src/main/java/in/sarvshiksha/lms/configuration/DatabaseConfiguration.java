package in.sarvshiksha.lms.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DatabaseConfiguration implements ServletContextListener {

    private Session session;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        servletContextEvent.getServletContext().setAttribute("session", session);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().removeAttribute("session");
        session.close();
    }
}
