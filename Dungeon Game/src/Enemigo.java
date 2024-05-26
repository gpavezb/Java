public class Enemigo {
    public static String nombreE;
    public Integer vidaE;
    public static Integer danioE;

    public Enemigo(String nombreE, Integer vidaE, Integer danioE) {
        this.nombreE = nombreE;
        this.vidaE = vidaE;
        this.danioE = danioE;

    } public Enemigo(){}

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public Integer getVidaE() {
        return vidaE;
    }

    public void setVidaE(Integer vidaE) {
        this.vidaE = vidaE;
    }

    public Integer getDanioE() {
        return danioE;
    }

    public void setDanioE(Integer danioE) {
        this.danioE = danioE;
    }

}
