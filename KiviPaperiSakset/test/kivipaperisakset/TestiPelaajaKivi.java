package kivipaperisakset;

public class TestiPelaajaKivi extends Pelaaja implements IPelaaja {

    public TestiPelaajaKivi() {
    	super();
    }
	public Vaihtoehto pelaajanValinta() {
        return säännöt.getVaihtoehto(KiviSaksetPaperi.KIVI);
    }

}
