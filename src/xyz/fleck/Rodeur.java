package xyz.fleck;

/**
 * Classe des joueurs de type Rôdeur
 *
 * @author flkoliv
 * @version 1.0
 */
public class Rodeur extends Joueur {

    /**
     * Constructeur du joueur Rôdeur
     *
     * @param numJoueur
     *          numéro du joueur
     * @param force
     *          force du joueur
     * @param agilite
     *          agilité du joueur
     * @param intelligence
     *          intelligence du joueur
     */
    public Rodeur(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        type = "Rôdeur";
        cri = "Chuuut";
        System.out.println(this.toString());
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Rôdeur
     * Tir à l'Arc ou Concentration
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Guerrier#jouer(int)
     */
    @Override
    protected void jouer(int choix) {
        switch (choix) {
            case 1:
                adversaire.enleverVie(agilite);
                System.out.println(nom + " utilise Tir à l'Arc et inflige " + agilite + " de dégâts");
                break;
            case 2:
                agilite = agilite + (niveau / 2);
                System.out.println(nom + " utilise Concentration et gagne " + (niveau / 2) + " d'agilité");

                break;
            default:
                break;
        }
        this.adversaire.activeJoueur();
    }
}
