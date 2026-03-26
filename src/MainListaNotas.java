import java.util.Scanner;

public class MainListaNotas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int notas[] = new int[5];
        int soma = 0;
        double media;

        System.out.println("digite 5 notas; ");

        for(int i=0; i < notas.length;i++){
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = sc.nextInt();
        }

        for(int nota:notas){
            System.out.println(nota);
            soma += nota;
        }

        media = (double) soma / notas.length;

        System.out.println(media);

        sc.close();

    }
}
