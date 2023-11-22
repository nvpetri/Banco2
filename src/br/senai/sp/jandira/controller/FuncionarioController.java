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

    public void editarFuncionario(String nome, double salario) throws SQLException {
        Statement statement = conection.createStatement();

        String queryUpdate = "update funcionarios set salario = " +salario+ "where nome = '" + nome +"'";

        statement.executeUpdate(queryUpdate);

        System.out.println("A partir de agora o salário de " + nome + " é: "+ salario);

    }

    public void deletarFuncionario( String nome) throws SQLException {
        Statement statement = conection.createStatement();

        String queryDelete = "delete from funcionarios where nome = '" + nome + "'";

        statement.executeUpdate(queryDelete);

        System.out.println("Funcionário " +nome + "deletado com sucesso!!");
    }

    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
        Statement statement = conection.createStatement();

        String queryCadastro = "INSERT INTO funcionarios (id_funcionario, nome, cargo, departamento, salario)values (" +
                funcionario.getId() + ",'" + funcionario.getNome() + "','" + funcionario.getCargo() + "','" +
                funcionario.getDepartamento() + "'," + funcionario.getSalario() + ")";

        statement.executeUpdate(queryCadastro);
        System.out.println("Funcionário Cadastrado com sucesso !");
    }

    public void consultarFuncionario(String nome) throws SQLException {
        Statement statement = conection.createStatement();
        String queryList = "select * from funcionarios where nome = '" + nome + "'";

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
}
