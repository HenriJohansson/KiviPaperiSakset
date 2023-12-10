package kivipaperisakset;

public class TestiPelaajaPaperi extends Pelaaja implements IPelaaja {

    public TestiPelaajaPaperi() {
    	super();
    }
	public Vaihtoehto pelaajanValinta() {
        return säännöt.getVaihtoehto(KiviSaksetPaperi.PAPERI);
    }

}
