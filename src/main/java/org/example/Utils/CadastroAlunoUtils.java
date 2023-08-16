package org.example.Utils;

import org.example.Models.Aluno;

public class CadastroUtils {
    public static boolean validarCadastro(Object objetoGenerico) {
        if (objetoGenerico.getClass().equals(Aluno.class)) {
            return validarAluno(((Aluno) objetoGenerico));
        }

        return false;
    }

    public static void imprimirDados(Object objetoGenerico){
      if (objetoGenerico.getClass().equals(Aluno.class)) {
        imprimirAluno((Aluno) objetoGenerico);
      }

    }

    public static boolean validarAluno(Aluno aluno) {
        return ((!aluno.getNome().isEmpty() && aluno.getNome().length() > 2)
            && (!aluno.getEndereco().isEmpty() && aluno.getEndereco().length() > 2)
                && (!aluno.getNumeroMatricula().isEmpty() && aluno.getNumeroMatricula().length() > 2 ));
    }
    public static void imprimirAluno(Aluno aluno) {
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Número da mátricula: " + aluno.getNumeroMatricula());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.printf("Primeira nota: %.2f", aluno.getNotaUm());
        System.out.printf("Segunda nota: %.2f", aluno.getNotaDois());
        System.out.printf("Terceira nota: %.2f", aluno.getNotaTres());

    }

}
