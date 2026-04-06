package PooBasico;

public class AlunoTestar {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //aluno1.nome = "Elias";
        aluno1.setNome("Elias");

        System.out.println(aluno1.getNome());

        //aluno1.idade = 100;

        aluno1.setIdade(50);
    }
}
