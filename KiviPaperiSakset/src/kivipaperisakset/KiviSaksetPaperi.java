package kivipaperisakset;

/**
 * 
 * @author Henri Johansson
 * Säilyttää Pelissä käytettävät vaihtoehdot
 */
public enum KiviSaksetPaperi {
	KIVI("Kivi"), SAKSET("Sakset"), PAPERI("Paperi");
	private String nimi;
	/**
	 * Luo enum nimellä
	 * @param String nimi
	 */
	private KiviSaksetPaperi(String nimi) {
		this.nimi = nimi;
	}
	/**
	 * @return palauttaa enumin String nimen
	 */
	public String getNimi(){
		return nimi;
	}
}
