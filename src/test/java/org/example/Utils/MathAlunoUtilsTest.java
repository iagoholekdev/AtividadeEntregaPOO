package org.example.Utils;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.example.Models.Aluno;

public class MathAlunoUtilsTest extends TestCase {

    public void testCalcularMedia() {
     Aluno aluno = new Aluno();
     aluno.setNotaUm(10.0).setNotaDois(10.0).setNotaTres(10.0);
     double somatorio = aluno.getNotaUm() + aluno.getNotaDois() + aluno.getNotaTres();
     double media     = somatorio / 3;
     Assert.assertEquals(10.0, media);
     aluno.setNotaUm(5.5).setNotaDois(5.5).setNotaTres(5.5);
     somatorio = aluno.getNotaUm() + aluno.getNotaDois() + aluno.getNotaTres();
     media     = somatorio / 3;
     Assert.assertEquals(5.5, media);
    }
}