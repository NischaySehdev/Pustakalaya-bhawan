package in.sarvshiksha.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_menu_page")
public class ClientMenuItem {

    @Column(name = "IMAGE_PATH")
    private String imagePath;

    @Id
    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_DESCRIPTION")
    private String menuDescription;

    @Column(name = "BUTTON_ACTION_LINK")
    private String buttonAction;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public String getButtonAction() {
        return buttonAction;
    }

    public void setButtonAction(String buttonAction) {
        this.buttonAction = buttonAction;
    }

    @Override
    public String toString() {
        return "ClientMenuItem{" +
                "imagePath='" + imagePath + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                ", buttonAction='" + buttonAction + '\'' +
                '}';
    }
}
