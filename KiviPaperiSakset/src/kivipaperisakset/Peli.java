package kivipaperisakset;

/**
 *
 * @author Henri Johansson
 */
public class Peli {
	/**
	 * Päämetodi, josta ohjelma aloittaa suorittamisensa.
	 * @param args
	 */
    public static void main(String args[]) {
       IPelaaja p1 = new Pelaaja();
       IPelaaja p2 = new Pelaaja();
       boolean peliLoppui = false;
       PeliLaskuri peliLaskuri = new PeliLaskuri();
        
       do {
           IPelaaja p1tai2 = peliLaskuri.erä(p1, p2);
           if(p1tai2 != null) {
        	   p1tai2.lisääVoitto();
           }
           if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
               peliLoppui = true;
               System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
           }
           System.out.println();
       } while (peliLoppui != true);
    }
}
