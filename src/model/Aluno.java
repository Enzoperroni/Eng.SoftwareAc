package model;



public class Aluno {
    /**
     */
    private final double media = 7.0;
    /**
     */
    private double ap1;
    /**
     */
    private double ap2;
    /**
     */
    private double avs;
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
        if ((this.ap1 + this.ap2) / 2 < media) {
            this.status = "AS";
        } else {
            this.status = "Aprovado";
        }
    }
    /**
     *
     * @param aavs avaliação substitutiva.
     */
    public void avaliar2(final double aavs) {
        this.avs = aavs;
        if (this.ap1 < this.ap2 && this.avs > this.ap1) {
            if ((this.avs + this.ap2) / 2 < media) {
                this.status = "Reprovado";
            } else {
                this.status = "Aprovado";
            }
        } else if(this.avs > this.ap2) {
            if ((this.avs + this.ap1) / 2 < media) {
                this.status = "Reprovado";
            } else {
                this.status = "Aprovado";
            }
        } else {
            this.status = "Reprovado";
        }
    }

    /**
     * @return retorna alguma coisa.
     */
    public String getStatus() {
        return status;
    }
}
