package in.sarvshiksha.lms.client;

import in.sarvshiksha.lms.model.ClientMenuItem;
import org.hibernate.Session;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private Session session;
    private List<ClientMenuItem> clientMenuItemsList;

    public Client(ServletContext servletContext) {
        clientMenuItemsList = new ArrayList<>();
        this.session = (Session) servletContext.getAttribute("session");
    }

    public Client() {
    }

    public void prepareClientPage() {
        clientMenuItemsList = session.createQuery("SELECT clientMenuItem FROM ClientMenuItem clientMenuItem", ClientMenuItem.class).getResultList();
        for (ClientMenuItem clientMenuItem : clientMenuItemsList) {
            System.out.println(clientMenuItem.toString());
        }
    }

    public List<ClientMenuItem> getClientMenuItemsList() {
        return clientMenuItemsList;
    }
}
