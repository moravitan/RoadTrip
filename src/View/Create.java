package View;

import Controller.Controller;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class Create implements Observer {

    private Controller controller;
    private Stage stage;

    public javafx.scene.control.TextField txtfld_userName;
    public javafx.scene.control.TextField txtfld_password;
    public javafx.scene.control.TextField txtfld_confirmPassword;
    public javafx.scene.control.TextField txtfld_firstName;
    public javafx.scene.control.TextField txtfld_LastName;
    public javafx.scene.control.TextField txtfld_Birdthday;
    public javafx.scene.control.TextField txtfld_Address;


    public void setController (Controller controller, Stage stage){
        this.controller = controller;
        this.stage = stage;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public void submit(ActionEvent actionEvent) {
        String userName = String.valueOf(txtfld_userName.getText());
        String password = String.valueOf(txtfld_password.getText());
        String confirmPassword = String.valueOf(txtfld_confirmPassword.getText());
        String firstName = String.valueOf(txtfld_firstName.getText());
        String lastName = String.valueOf(txtfld_LastName.getText());
        String birthday = String.valueOf(txtfld_Birdthday.getText());
        String address = String.valueOf(txtfld_Address.getText());


    }
}
