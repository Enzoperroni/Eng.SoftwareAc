package control;

import model.Aluno;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Classe principal que executa o programa de avaliação de alunos.
 */
public class Programa {
    /**
     * Logger para registrar mensagens no console.
     */
    private static final Logger LOGGER = Logger.getLogger(
            Programa.class.getName());

    /**
     * Executa o fluxo principal do programa.
     */
    public void executar() {
        Scanner sc = new Scanner(System.in);

        LOGGER.info("Digite a primeira prova: ");
        double ap1 = sc.nextDouble();

        LOGGER.info("Digite a segunda prova: ");
        double ap2 = sc.nextDouble();

        Aluno felipe = new Aluno(ap1, ap2);
        felipe.avaliar1();
        felipe.avaliar2(2);

        LOGGER.info("Status do aluno: " + felipe.getStatus());
    }

    /**
     * Método principal que inicia a execução do programa.
     * @param args Argumentos passados via linha de comando.
     */
    public static void main(final String[] args) {
        new Programa().executar();
    }
}
