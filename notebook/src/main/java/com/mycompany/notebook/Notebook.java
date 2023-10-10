/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notebook;

/**
 *
 * @author LabJF
 */
public class Notebook {
    
    private String marca;
    private String modelo;
    private double tela;
    
    public Notebook() {
        this.marca = "unknown";
        this.modelo = "unknown";
        this.tela = 0.0;
    }
    
    public Notebook(String marca, String modelo, double tela) {
        this.marca = marca;
        this.modelo = modelo;
        this.tela = tela;
    }
    
    public String getMarca(){
        return this.marca;
        
    }
    public String getModelo(){
        return this.modelo;
        
    }
    public double getTela(){
        return this.tela;
        
    }      
}
