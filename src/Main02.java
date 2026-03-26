import java.util.Scanner;

public class Main02 {
    static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int [] notas = {1,2,3,4,5};  // arrays são váriaveis do tipo reference;

        notas[0] = sc.nextInt();
        notas[1] = sc.nextInt();
        notas[2] = sc.nextInt();
        notas[3] = sc.nextInt();
        notas[4] = sc.nextInt();

     /*   for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }*/

        for(int num:notas){ // -> o famoso foreach!
            System.out.println(num);
        }

    }
}
