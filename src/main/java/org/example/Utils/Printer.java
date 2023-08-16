package org.example.Utils;


import org.example.Interfaces.IPrinter;
import org.example.Models.Aluno;

public class Printer implements IPrinter<Aluno> {
    public void print(Aluno aluno) {
        System.out.printf("********* CADASTRO ALUNO %s *********** \n", aluno.getNome());
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Número da mátricula: " + aluno.getNumeroMatricula());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.printf("Primeira nota: %.2f \n", aluno.getNotaUm());
        System.out.printf("Segunda nota: %.2f \n", aluno.getNotaDois());
        System.out.printf("Terceira nota: %.2f \n", aluno.getNotaTres());
        System.out.println("****************");
    }


}
