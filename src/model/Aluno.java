package model;



public class Aluno {
    /**
     */
    private static final double MEDIA = 7.0;
    /**
     */
    private static String aprovado = "Aprovado";
    /**
     */
    private static String as = "As";
    /**
     */
    private static String reprovado = "Reprovado";
    /**
     */
    private double ap1;
    /**
     */
    private double ap2;
    /**
     */
    private String status;

    /**
     *
     * @param aap1 prova1.
     * @param aap2 prova2.
     */
    public Aluno(final double aap1, final double aap2) {
        this.ap1 = aap1;
        this.ap2 = aap2;
    }

    /**
     *
     */
    public void avaliar1() {
        if ((this.ap1 + this.ap2) / 2 < MEDIA) {
            this.status = as;
        } else {
            this.status = "Aprovado";
        }
    }
    /**
     *
     * @param avs avaliação substitutiva.
     */
    public void avaliar2(final double avs) {
        double melhorNota = 0;
        double menorNota = 0;
        if (this.ap1 > this.ap2) {
            melhorNota = this.ap1;
            menorNota = this.ap2;
        } else {
            melhorNota = this.ap2;
            menorNota = this.ap1;
        }
        if (avs < menorNota) {
            status = reprovado;
        } else {
            double novaMedia = (melhorNota + avs) / 2;
            if (novaMedia >= MEDIA) {
                status = aprovado;
            } else {
                status = reprovado;
            }
        }


    }

    /**
     * @return retorna alguma coisa.
     */
    public String getStatus() {
        return status;
    }
}
