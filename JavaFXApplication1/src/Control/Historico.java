/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Calculadora;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author 04150107211
 */
public class Historico {
    
    @FXML
    private TableView tabelaHistórico;
    
    public void initialize(URL url, ResourceBundle rb) {
        listar();
    }   
    
    private void listar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
        EntityManager em = emf.createEntityManager();
         
        Query query = em.createQuery("SELECT a FROM Calculadora as a");
        List<Calculadora> alunos = query.getResultList();
        
        ObservableList oHistorico = FXCollections.observableArrayList(alunos);                                 
        tabelaHistórico.setItems(oHistorico);
    }
    
    
}
