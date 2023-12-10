
package kivipaperisakset;

/**
 * 
 * @author Henri Johansson
 * 
 * Pelaaja voi pelata peliä
 *
 */
public class Pelaaja implements IPelaaja {

    private int voitot;      // Voittojen lukumäärä
    protected ILogiikka säännöt;
    public Pelaaja() {
    	voitot = 0;
    	this.säännöt = Logiikka.getInstance();
    }

    /**
     * Valitse randomilla kivi, paperi tai sakset
     * @return Vaihtoehto, joka valittiin.
     */
    public Vaihtoehto pelaajanValinta() {
        Vaihtoehto valinta = null;
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = säännöt.getVaihtoehto(KiviSaksetPaperi.KIVI);
                break;
            case 1:
                valinta = säännöt.getVaihtoehto(KiviSaksetPaperi.PAPERI);;
                break;
            case 2:
                valinta = säännöt.getVaihtoehto(KiviSaksetPaperi.SAKSET);
                break;
        }
        return valinta;
    }
    
    /**
     * Lisää yksi voitto Pelaajan voittoihin
     */
    public void lisääVoitto() {
    	this.voitot++;
    }

    /**
     * Palauttaa voitot
     */
    public int getVoitot() {
        return this.voitot;
    }
}
