/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senaimt.projetorest;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Produto implements Serializable {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
