package org.example.Models;

public class Aluno {
    private String nome;
    private String numeroMatricula;
    private String endereco;
    private double notaUm;
    private double notaDois;
    private double notaTres;

    void Aluno(){
         this.nome = "";
         this.numeroMatricula = "";
         this.endereco = "";
         this.notaUm = 0.0;
         this.notaDois = 0.0;
         this.notaTres = 0.0;
    }

    void Aluno(String nomeAluno, String numeroMatricula) {
        this.nome = nomeAluno;
        this.numeroMatricula = numeroMatricula;
        this.endereco = "";
        this.notaUm = 0.0;
        this.notaDois = 0.0;
        this.notaTres = 0.0;
    }
    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public Aluno setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Aluno setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public Aluno setNotaUm(double notaUm) {
        if (notaUm < 0) {
          this.notaUm = 0;
        } else {
          this.notaUm = notaUm;
        }
        return this;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public Aluno setNotaDois(double notaDois) {
        if (notaDois < 0 ) {
          this.notaDois = 0;
        } else {
          this.notaDois = notaDois;
        }
        return this;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public Aluno setNotaTres(double notaTres) {
        if (notaTres < 0) {
          this.notaTres = 0;
        } else {
          this.notaTres = notaTres;
        }

        return this;
    }


}
