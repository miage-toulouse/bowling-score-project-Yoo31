package miage.ymaa.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<Jeu>();

    public Partie(Jeu leJeu) {
        for (int i = 0 ; i < 10 ; i++) {
            jeux.add(leJeu);
        }
            if (jeux.get(9).isSpare()) {
                jeux.add(leJeu);
            }
        }


    public Integer calculeScore(){
        Integer score = 0;
        for (int i = 0 ; i < 10 ; i++) {
            Jeu jeuCourant = jeux.get(i);
            score += jeuCourant.nombreQuillesTombees();
            if (jeuCourant.isSpare()){
                score += jeux.get(i+1).nombreQuillesTombeesLancer1();
            }
        }
        return score;
    }
}
