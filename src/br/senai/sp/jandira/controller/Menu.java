package br.senai.sp.jandira.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("/----------- Seja bem viado -----------/");
            System.out.println("1 - Listar Funcionários");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Editar Funcionário");
            System.out.println("4 - Deletar Funcionário");
            System.out.println("5 - Pesquisar Funcionário");
            System.out.println("6 - Sair");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();
            scanner.nextLine();

            FuncionarioController funcionarioController = new FuncionarioController();

            switch (option){
                case 1:
                    funcionarioController.listarFuncionarios();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("Digite o nome: ");
                    String funcionario = scanner.nextLine();
                    funcionarioController.deletarFuncionario(funcionario);
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
