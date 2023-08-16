package org.example.Interfaces;

import org.example.Models.Aluno;

public interface ICadastroAlunoUtils<T> {
    boolean validar(T aluno);
}