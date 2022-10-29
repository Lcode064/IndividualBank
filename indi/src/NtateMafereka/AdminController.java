
package NtateMafereka;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
public class AdminController {
    @FXML
    Parent rt;
    @FXML
    Stage stage;
    @FXML
    Scene scene;
    Alert ex = new Alert(Alert.AlertType.WARNING, "GoodBye",ButtonType.OK);
    @FXML
    void exitProgram(ActionEvent event)
    {
        ex.show();
        Platform.exit();
        System.exit(0);
        
    }
        @FXML
    void cryptorecords(ActionEvent event) throws FileNotFoundException, IOException
    {
       File file=new File("crypto.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void ewalletrecords(ActionEvent event) throws FileNotFoundException, IOException 
    {
        File file=new File("wallet.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void loginRecords(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("login.txt");    
        Desktop.getDesktop().print(file);
        
    }

    @FXML
    void paidfees(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("fees.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void registrationrecords(ActionEvent event) throws FileNotFoundException, IOException
    {
       
        File file=new File("reg.txt");    
        Desktop.getDesktop().print(file);
    }

    @FXML
    void sendMoneyRecords(ActionEvent event) throws FileNotFoundException, IOException
    {
        File file=new File("sendmon.txt");    
        Desktop.getDesktop().print(file);
       

    }
   
}
