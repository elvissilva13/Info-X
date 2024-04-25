/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;
import java.sql.*;
/**
 *
 * @author Elvis & Ketly
 */
public class ModuloConexao {
    //metodo responsável pela conexão
    public static Connection conector(){
        //variavel conexão
        java.sql.Connection conexao = null;
        //chamndo o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //variavéis p/ armazenar informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "846199";
        //estabelecendo a conexão com o db
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            
        } catch (Exception e) {
            // abaixo o apoio ao usuário
           // System.out.println(e);
            return null;
        }
    }
    
}
