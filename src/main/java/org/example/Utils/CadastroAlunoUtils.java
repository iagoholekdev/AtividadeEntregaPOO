package org.example.Utils;

import org.example.Interfaces.ICadastroUtils;
import org.example.Models.Aluno;

public class CadastroAlunoUtils implements ICadastroUtils<Aluno> {

    public  boolean validar(Aluno aluno) {
       return (
            (!aluno.getNome().isEmpty() && aluno.getNome().length() > 2)
            && (!aluno.getEndereco().isEmpty() && aluno.getEndereco().length() > 2)
            && (!aluno.getNumeroMatricula().isEmpty() && aluno.getNumeroMatricula().length() > 2 )
       );
    }
}
