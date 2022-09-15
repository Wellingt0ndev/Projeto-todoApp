/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author Wellington F.
 */
public class ProjectController {
    public void save(Project project) {
        String sql = "INSERT INTO projects (name, description,"
                + " createdAt, updateAt) VALUES"
                + " (?, ? ,? ,?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement(sql);
            // Setando os valores do statement
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            //Executando a query
            statement.execute();
        } catch (SQLException VAR12) {
            throw new RuntimeException("Erro ao salvar a tarefa", VAR12);
        } finally {
            try{
                if (statement != null){
                    statement.close();
                }
                
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException VAR13){
                throw new RuntimeException ("Erro ao fechar conexão", VAR13);
            }
            
        }
    }

    public void update(Project project) {
        String sql = "UPDATE projects SET  name = ?, description = ?,"
                + " createdAt = ?, updateAt = ?, WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement(sql);
            // Setando os valores do statement
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            statement.setInt(5, project.getId());
            //Executando a query
            statement.execute();
        } catch (SQLException VAR12) {
            throw new RuntimeException("Erro ao atualizar a tarefa" , VAR12);
        } finally {
            try{
                if (statement != null){
                    statement.close();
                }
                
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException VAR13){
                throw new RuntimeException ("Erro ao fechar conexão", VAR13);
            }
            
        }
    }
    
    public List<Project> getAll() {
        String sql = "SELECT * FROM projects";
        //Lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Project> projects = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

        
        try {
            //Criação da conexão
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            //Valor retornado pela execução da query
            resultSet = statement.executeQuery();
            //Enquanto houverem valores a serem percorridos no meu resultSet
            while (resultSet.next()) {
                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdateAt(resultSet.getDate("updateAt"));
                //Adiciona o contato recuperado a lista de contatos
                projects.add(project);
            }
        } catch (SQLException var14) {
            throw new RuntimeException("Erro ao buscar os projetos", var14);
        } finally {
            try {
                if (resultSet != null) {
                   resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var13) {
                throw new RuntimeException("Erro ao fechar a conexão", var13);
            }

        }

        return projects;
    }
    
    public void removeById(int idProject){
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //Criação da conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            //Preparando a query
            statement = connection.prepareStatement(sql);
            // Setando os valores do statement
            statement.setInt(1, idProject);
            //Executando a query
            statement.execute();

        } catch (SQLException VAR12) {
            throw new RuntimeException("Erro ao deletar a tarefa" , VAR12);
        } finally {
            try{
                if (statement != null){
                    statement.close();
                }
                
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException VAR13){
                throw new RuntimeException ("Erro ao fechar conexão", VAR13);
            }
            
        }
    }
}
