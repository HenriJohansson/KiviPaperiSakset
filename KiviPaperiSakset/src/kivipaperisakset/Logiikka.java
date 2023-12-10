package kivipaperisakset;

public class Logiikka implements ILogiikka {
	private Vaihtoehto kivi, paperi, sakset;
	private static final Logiikka instanssi = new Logiikka();
	
	/**
	 * Rakennetaan pelin säännöt suoraan logiikan constructorissa.
	 */
	private Logiikka() {
		this.kivi = new Vaihtoehto(
				KiviSaksetPaperi.KIVI, 
				KiviSaksetPaperi.PAPERI, 
				KiviSaksetPaperi.SAKSET);
		this.paperi = new Vaihtoehto(
				KiviSaksetPaperi.PAPERI, 
				KiviSaksetPaperi.SAKSET, 
				KiviSaksetPaperi.KIVI);
		this.sakset = new Vaihtoehto(
				KiviSaksetPaperi.SAKSET, 
				KiviSaksetPaperi.KIVI, 
				KiviSaksetPaperi.PAPERI);
	}
	public static Logiikka getInstance() {
		return instanssi;
	}
	
	/**
	 * Selvitetään voittaja kahden pelaajan välillä
	 * @param Vaihtoehto p1Vaihtoehto
	 * @param Vaihtoehto p2Vaihtoehto
	 * @return int: 1 on voitto, 0 on tasapeli, -1 on häviö
	 */
	public int voittaako(Vaihtoehto p1Vaihtoehto, Vaihtoehto p2Vaihtoehto) {
		if(p1Vaihtoehto.voittankoVertailun(p2Vaihtoehto) == null) {
			return 0;
		}
		if(p1Vaihtoehto.voittankoVertailun(p2Vaihtoehto).equals(p1Vaihtoehto)) {
			return 1;
		} else if (p1Vaihtoehto.voittankoVertailun(p2Vaihtoehto).equals(p2Vaihtoehto)) {
			return -1;
		}
		return 0;
	}
	/**
	 * Pyydetään pelinsääntöjen mukainen kivi sakset tai paperi
	 * @return Vaihtoehto kivi sakset tai paperi
	 */
	public Vaihtoehto getVaihtoehto(KiviSaksetPaperi vaihtoehto){
		switch(vaihtoehto){
		case KIVI:
			return kivi;
		case SAKSET:
			return sakset;
		case PAPERI:
			return paperi;
		default:
			return kivi;
		}
	}
}
