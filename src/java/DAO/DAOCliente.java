/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import MODEL.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOCliente {
    private Connection conn;
    private PreparedStatement stmt;
    
    public DAOCliente(){
        conn = new Conexao().getConexao();
        
    }
    
    //metodo inserir Cliente
    
    public void inserirCliente(Cliente cliente){
        String sql = "INSERT INTO tb_cliente (nome,email) "
                + "VALUES (?,?)"; 
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro inserir Cliente: ", erro);
        }
    }
}
