package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {
    private String nome, cargo, departamento;
    private int id;
    private double salario;

    public void cadastrarFuncionario(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Informe o cargo: ");
        this.cargo = scanner.nextLine();

        System.out.print("Informe o departamento: ");
        this.departamento = scanner.nextLine();

        System.out.print("Informe o salario: ");
        this.salario = scanner.nextDouble();

        scanner.nextLine();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
