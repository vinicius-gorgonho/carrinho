/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senaimt.projetorest;

import java.io.Serializable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author usuario
 */
@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoController implements Serializable {

    @GET
    @Path("/")
    public Produto getProduto(@PathParam("id") int id) {
        Produto p = new Produto("Arroz");
        return p;
    }

    @GET
    @Path("/produtos")
    public Produto getProdutos(@PathParam("id") int id) {
        Produto p = new Produto("Feijão");
        return p;
    }
}
