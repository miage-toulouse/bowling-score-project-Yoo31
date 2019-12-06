package miage.ymaa.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalculeScorePartieSansStrikeSansSpare(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(6, 0);
        Partie laPartie = new Partie(leJeu);

        //when : on calcule le score
        Integer score = laPartie.calculeScore();

        //then : on vérifie que le score est égal à 60
        assertEquals(Integer.valueOf(60), score);
    }

    @Test
    public void testCalculeScorePartieAvecQueDesSpare(){
        //given : une partie de 10 jeux avec 6 quilles tombées dans chaque jeu
        Jeu leJeu = new Jeu(5, 5);
        Partie laPartie = new Partie(leJeu);

        //when : on calcule le score
        Integer score = laPartie.calculeScore();

        //then : on vérifie que le score est égal à 60
        assertEquals(Integer.valueOf(150), score); //On prend aussi en compte le premier lancer de la partie suivante donc (5 + 5 + 5)*10
    }
}