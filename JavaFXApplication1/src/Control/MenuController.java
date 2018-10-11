package Control;

import Model.Calculadora;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        double valor1= Double.parseDouble(txtPrimeiro.getText());
        double valor2= Double.parseDouble(txtSegundo.getText());
        double resultado=valor1+valor2;
        txtResult.setText(""+resultado);
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
         EntityManager em = emf.createEntityManager();

            Calculadora c = new Calculadora();
            c.setPrimeiroValor(Double.parseDouble(txtPrimeiro.getText()));
            c.setSegundoValor(Double.parseDouble(txtSegundo.getText()));
            c.setOperador("+");
            c.setResultado(resultado);
            
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
