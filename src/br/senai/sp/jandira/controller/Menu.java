package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){

            Scanner scanner = new Scanner(System.in);

            System.out.println("/----------- Senai Jandira ------------/");
            System.out.println("1 - Funcionários");
            System.out.println("2 - Departamentos");
            int userOpt = scanner.nextInt();

            switch (userOpt){
                case 1:
                    MenuFuncionario menuFuncionario = new MenuFuncionario();
                    menuFuncionario.menuFuncionario();
                    break;
                case 2:

                    break;
            }

        }
    }
}
