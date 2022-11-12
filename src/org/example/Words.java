/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author Joao
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Words implements criptos{
    
    private String texto;
    private String textodes;
    private int chave;
    
    public Words(String texto, String textodes, int chave) {
        this.texto = texto;
        this.chave = chave;
    }
    
    public Words(){
    }
    
    public String getTextodes(){
        return textodes;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public int getChave(int chave){
        return chave;
    }
    
    public void setTexto(String texto){
    this.texto = texto;
    
    }
    public void setTextodes(String textodes){
    this.textodes = textodes;
    
    }
    public void setChave(int chave){
    this.chave = chave;
    
    }
    
    
    
    public String encriptar(int chave, String texto) {
    StringBuilder textoCifrado = new StringBuilder();
    int tamanhoTexto = texto.length();

    for (int c = 0; c < tamanhoTexto; c++) {
        int letraCifradaASCII = ((int) texto.charAt(c)) + chave;

        while (letraCifradaASCII > 126) {
            letraCifradaASCII -= 94; //loop alfabeto infinito
        }

        textoCifrado.append((char) letraCifradaASCII);
    }

    return textoCifrado.toString();
}
    
    


    public String decriptar(int chave, String textoCifrado) {
           
    StringBuilder texto = new StringBuilder();
    int tamanhoTexto = textoCifrado.length();

    
    
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;

            while (letraDecifradaASCII < 32) {
                letraDecifradaASCII += 94;
            }

            texto.append((char) letraDecifradaASCII);
        }//fim do for c
    

        return texto.toString();
            }

        }





