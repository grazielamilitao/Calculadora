package Control;

import Model.Calculadora;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
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
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }

    @FXML
    private void Subtracao(ActionEvent event) {
                double valor1= Double.parseDouble(txtPrimeiro.getText());
        double valor2= Double.parseDouble(txtSegundo.getText());
        double resultado=valor1-valor2;
        txtResult.setText(""+resultado);
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
         EntityManager em = emf.createEntityManager();

            Calculadora c = new Calculadora();
            c.setPrimeiroValor(Double.parseDouble(txtPrimeiro.getText()));
            c.setSegundoValor(Double.parseDouble(txtSegundo.getText()));
            c.setOperador("-");
            c.setResultado(resultado);
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }

    @FXML
    private void Divisao(ActionEvent event) {
                double valor1= Double.parseDouble(txtPrimeiro.getText());
        double valor2= Double.parseDouble(txtSegundo.getText());
        double resultado=valor1/valor2;
        txtResult.setText(""+resultado);
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
         EntityManager em = emf.createEntityManager();

            Calculadora c = new Calculadora();
            c.setPrimeiroValor(Double.parseDouble(txtPrimeiro.getText()));
            c.setSegundoValor(Double.parseDouble(txtSegundo.getText()));
            c.setOperador("/");
            c.setResultado(resultado);
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }

    @FXML
    private void Multiplicacao(ActionEvent event) {
                double valor1= Double.parseDouble(txtPrimeiro.getText());
        double valor2= Double.parseDouble(txtSegundo.getText());
        double resultado=valor1*valor2;
        txtResult.setText(""+resultado);
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
         EntityManager em = emf.createEntityManager();

            Calculadora c = new Calculadora();
            c.setPrimeiroValor(Double.parseDouble(txtPrimeiro.getText()));
            c.setSegundoValor(Double.parseDouble(txtSegundo.getText()));
            c.setOperador("*");
            c.setResultado(resultado);
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
    }

    @FXML
    private void Historico(ActionEvent event) throws IOException{
         
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("View/Histórico.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600,400);
        Stage stage = new Stage();
        stage.setTitle("Historico");
        stage.setScene(scene);
        stage.show();
    }
    
    private void chamarHistórico(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("view/Histórico.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),888,702);
        Stage stage = new Stage();
        stage.setTitle("Histórico");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void chamarHistorico(ActionEvent event) {
    }
    
    
    
}
