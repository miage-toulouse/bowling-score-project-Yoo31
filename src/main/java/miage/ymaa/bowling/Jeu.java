package miage.ymaa.bowling;

public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Integer nombreQuillesTombees(){
        return lancer1 + lancer2;
    }

    public Integer nombreQuillesTombeesLancer1(){
        return lancer1;
    }

    public boolean isSpare() {
        return lancer1 + lancer2 == 10;
    }
}
