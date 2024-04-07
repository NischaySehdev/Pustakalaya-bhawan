package in.sarvshiksha.lms.admin;

import in.sarvshiksha.lms.model.AdminMenuItem;
import org.hibernate.Session;

import javax.servlet.ServletContext;
import java.util.List;

public class Admin {
    private final Session session;
    private List<AdminMenuItem> adminMenuItems;

    public Admin(ServletContext servletContext) {
        this.session = (Session) servletContext.getAttribute("session");
    }

    public void prepareAdminPage() {
        adminMenuItems = session.createQuery("SELECT adminMenuItem FROM AdminMenuItem adminMenuItem", AdminMenuItem.class).getResultList();
    }

    public List<AdminMenuItem> getAdminMenuItems() {
        return adminMenuItems;
    }
}
