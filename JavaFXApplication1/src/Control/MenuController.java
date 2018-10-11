package Control;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MenuController implements Initializable {

    @FXML
    private JFXTextField txtPrimeiro;
    @FXML
    private JFXTextField txtSegundo;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSub;
    @FXML
    private Button btnDivi;
    @FXML
    private Button btnMult;
    @FXML
    private Label txtResult;
    @FXML
    private Button btnHistorico;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void Soma(ActionEvent event) {
    }

    @FXML
    private void Subtracao(ActionEvent event) {
    }

    @FXML
    private void Divisao(ActionEvent event) {
    }

    @FXML
    private void Multiplicacao(ActionEvent event) {
    }

    @FXML
    private void Historico(ActionEvent event) {
    }
    
}
