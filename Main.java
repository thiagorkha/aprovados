import java.util.Scanner;
import entities.Alunos;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Quantos alunos serao digitados? ");
    int n = sc.nextInt();
    sc.nextLine();

    Alunos[] vect = new Alunos[n];

    for (int i=0; i<vect.length; i++) {
      System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
      String nome = sc.nextLine();
      double priNota = sc.nextDouble();
      double segNota = sc.nextDouble();
      sc.nextLine();

      vect[i] = new Alunos(nome, priNota, segNota);
    }

    System.out.println("Alunos aprovados:");
    for (int i=0; i<vect.length; i++) {
      double media = (vect[i].getPriNota() + vect[i].getSegNota()) / 2;
      if (media >= 6.0) {
        System.out.println(vect[i].getNome());
      }
    }
    
  }
}