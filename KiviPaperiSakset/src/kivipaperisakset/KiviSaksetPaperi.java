package kivipaperisakset;

public enum KiviSaksetPaperi {
	KIVI("Kivi"), SAKSET("Sakset"), PAPERI("Paperi");
	private String nimi;
	private KiviSaksetPaperi(String nimi) {
		this.nimi = nimi;
	}
	public String getNimi(){
		return nimi;
	}
}
