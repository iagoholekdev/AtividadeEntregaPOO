package org.example.Utils;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.example.Models.Aluno;

public class CadastroAlunoUtilsTest extends TestCase {
    public void testName() {
        makeTest();
    }

    void makeTest() {
        Aluno aluno = new Aluno();

        aluno.setNome("1").setNumeroMatricula("2").setEndereco("3");
        CadastroAlunoUtils cadastroTeste = new CadastroAlunoUtils();
        Assert.assertFalse(cadastroTeste.validar(aluno));

        Aluno aluno2 = new Aluno();
        aluno2.setNome("123").setNumeroMatricula("2123").setEndereco("31231");
        Assert.assertTrue(cadastroTeste.validar(aluno2));

    }

}