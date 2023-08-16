package org.example;

import org.example.Models.Aluno;
import org.example.Utils.CadastroAlunoUtils;
import org.example.Utils.MathAlunoUtils;
import org.example.Utils.Printer;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     try {
         Scanner myScanner = new Scanner(System.in);
         CadastroAlunoUtils validadorCadastro = new CadastroAlunoUtils();
         Aluno alunoUm = new Aluno();
         do {
             System.out.println("Digite o nome do aluno: ");
             String nomeAluno = myScanner.nextLine();
             System.out.println("Digite o número da mátrica do aluno: ");
             String numeroMatricula = myScanner.nextLine();
             System.out.println("Digite o endereço do aluno: ");
             String endereco = myScanner.nextLine();


             alunoUm
                 .setNome(nomeAluno)
                 .setNumeroMatricula(numeroMatricula)
                 .setEndereco(endereco);

         } while (!validadorCadastro.validar(alunoUm));
         System.out.println("Digite a primeira nota do aluno: ");
         double notaUm = myScanner.nextDouble();
         System.out.println("Digite a segunda nota do aluno: ");
         double notaDois = myScanner.nextDouble();
         System.out.println("Digite a terceira nota  aluno: ");
         double notaTres = myScanner.nextDouble();
         alunoUm
             .setNotaUm(notaUm)
             .setNotaDois(notaDois)
             .setNotaTres(notaTres);

         Printer printerAluno = new Printer();
         printerAluno.print(alunoUm);
         MathAlunoUtils mathAluno = new MathAlunoUtils();
         mathAluno.calcularMedia(alunoUm);
         myScanner.close();
     } catch (Exception e) {
         System.out.println("Ocorreu um erro ao cadastrar o aluno! Motivo: " + e.getMessage());
     }
    }
}
