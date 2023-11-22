package br.senai.sp.jandira.controller;

import java.util.Scanner;

public class MenuDepartamento {
    public void menuDepartamento(){
        System.out.println("1 - Listar Funcionários");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Editar Funcionário");
        System.out.println("4 - Deletar Funcionário");
        System.out.println("5 - Pesquisar Funcionário");
        System.out.println("6 - Sair");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        scanner.nextLine();
    }
}
