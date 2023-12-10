package kivipaperisakset;
/**
 * 
 * @author Henri Johansson
 * Luokka edustaa yhtä vaihtoehtoa kivi-sakset-paperi -pelin säännöissä.
 *
 */
public class Vaihtoehto {
	private KiviSaksetPaperi vaihtoEhto;
	private KiviSaksetPaperi voittaa, häviää;
	/**
	 * Konstruktori asettaa vaihtoehdon, voittavan vaihtoehdon ja häviävän vaihtoehdon.
	 * @param vaihtoEhto on itse tämä vaihtoehto
	 * @param voitta on vaihtoehto, joka voittaa tämän vaihtoehdon
	 * @param häviää on vaihtoehto, joka häviää tälle vaihtoehdolle
	 */
	public Vaihtoehto(
			KiviSaksetPaperi vaihtoEhto
			, KiviSaksetPaperi voittaa
			, KiviSaksetPaperi häviää) {
		this.vaihtoEhto = vaihtoEhto;
		this.voittaa = voittaa;
		this.häviää = häviää;
	}
	
	/**
	 * Vaithoehto, joka on valittu
	 * @return vaihtoehdon enumin KiviSaksetPaperi
	 */
	public KiviSaksetPaperi getVaihtoEhto() {
		return vaihtoEhto;
	}
	
	/**
	 * Vaihtoehto, joka voittaa valitun Vaihtoehdon
	 * @return KiviSaksetPaperi tämän vaihtoehdon voittaja
	 */
	public KiviSaksetPaperi getVoittaa(){
		return voittaa;
	}
	/**
	 * Vaihtoehto, joka häviää valitulle Vaihtoehdolle
	 * @return KiviSaksetPaperi tämän vaihtoehdon voittaja
	 */
	public KiviSaksetPaperi getHäviää(){
		return häviää;
	}
	
	/**
     * Vertailee kahta vaihtoehtoa ja palauttaa sen, kumpi voittaa vertailussa.
     * @param vieras Vaihtoehto, jonka kanssa vertailu tehdään.
     * @return Voittavan vaihtoehdon tai null, jos tulos on tasapeli.
     */
	public Vaihtoehto voittankoVertailun(Vaihtoehto vieras) {
		if(this.voittaa.equals(vieras.vaihtoEhto)) {
			return vieras;
		} else if (this.häviää.equals(vieras.vaihtoEhto)) {
			return this;
		} else {
			return null;
		}
	}
	
	/**
     * Vertailee kahta vaihtoehtoa ja tarkistaa, ovatko ne samat.
     * @param obj Toinen objekti, jonka kanssa vertailu tehdään.
     * @return true, jos vaihtoehdot ovat samat, muuten false.
     */
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Vaihtoehto) {
			Vaihtoehto toinen = (Vaihtoehto) obj;
			if(
					this.vaihtoEhto == toinen.vaihtoEhto && 
					this.häviää == toinen.häviää && 
					this.voittaa == toinen.voittaa) {
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
}
