package org.example.Utils;

import org.example.Interfaces.IMathUtils;
import org.example.Models.Aluno;


public class MathUtils implements IMathUtils {
     public void calcularMedia(Aluno aluno) {
         double somatorio = aluno.getNotaUm() + aluno.getNotaDois() + aluno.getNotaTres();
         double media     = somatorio / 3;
         System.out.printf("A média do aluno é:  %.2f", media);

    }
}
