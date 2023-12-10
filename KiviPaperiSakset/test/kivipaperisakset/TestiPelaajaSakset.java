package kivipaperisakset;

public class TestiPelaajaSakset extends Pelaaja implements IPelaaja {

    public TestiPelaajaSakset() {
    	super();
    }
	public Vaihtoehto pelaajanValinta() {
        return säännöt.getVaihtoehto(KiviSaksetPaperi.SAKSET);
    }

}
