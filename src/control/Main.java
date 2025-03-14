package control;
import model.Aluno;

import java.util.ArrayList;

public class Main {
    /**
     * @param args argumentos ai.
     */
    public static void main(final String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Aluno felipe = new Aluno(2, 10);
        felipe.avaliar1();
        felipe.avaliar2(2);
        System.out.println(felipe.getStatus());
    }
}
