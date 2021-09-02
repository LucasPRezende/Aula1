/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author lucas
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            return DriverManager.getConnection("jdbc:derby://localhost/dbTreino", "lucas","123");
        }catch(Exception erro){
            throw new RuntimeException("Erro classe Conexão: ", erro);
        }
    }
    
}
