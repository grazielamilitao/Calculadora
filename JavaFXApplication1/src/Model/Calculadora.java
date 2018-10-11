/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 04097711202
 */
@Entity
public class Calculadora {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int txtCodigo;
    
    private double primeiroValor;
    private double segundoValor;
    private double operador;
    private double resultado;

    public int getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(int txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public double getOperador() {
        return operador;
    }

    public void setOperador(double operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
