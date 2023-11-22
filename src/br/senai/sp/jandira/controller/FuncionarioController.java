package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioController {

    Conexao conexao =new Conexao();

    Connection conection = conexao.getConexao();
    public void listarFuncionarios() throws SQLException {
        Statement statement = conection.createStatement();
        String queryList = "select * from funcionarios";

        ResultSet resultSet = statement.executeQuery(queryList);

        Funcionario funcionario = new Funcionario();

        while (resultSet.next()){
            funcionario.setId(resultSet.getInt("id_funcionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setCargo(resultSet.getString("cargo"));
            funcionario.setDepartamento(resultSet.getString("departamento"));
            funcionario.setSalario(resultSet.getDouble("salario"));

            System.out.println(funcionario.getId());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDepartamento());
            System.out.println(funcionario.getSalario());

        }

    }

    public void editarFuncionario(){

    }

    public void deletarFuncionario( String nome) throws SQLException {
        Statement statement = conection.createStatement();

        String queryDelete = "delete from funcionarios where nome = '" + nome + "'";

        statement.executeUpdate(queryDelete);

        System.out.println("Funcionário " +nome + "deletado com sucesso!!");
    }

    public void cadastrarFuncionario(){

    }

    public void consultarFuncionario(){

    }
}
