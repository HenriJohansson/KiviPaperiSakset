package kivipaperisakset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VaihtoehtoTesti {
	Vaihtoehto kivi, sakset, paperi, raketti;
	@BeforeEach
	void setUp() throws Exception{
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
		this.raketti = new Vaihtoehto(
				KiviSaksetPaperi.KIVI,
				KiviSaksetPaperi.PAPERI,
				null);
	}

	@Test
	void samallaisetTäsmäävät() {
		Vaihtoehto kivi2 = new Vaihtoehto(
				KiviSaksetPaperi.KIVI, 
				KiviSaksetPaperi.PAPERI, 
				KiviSaksetPaperi.SAKSET);
		assertEquals(kivi, kivi2);
	}
	@Test 
	void erilaisetEivätTäsmää() {
		Vaihtoehto erilainenKivi = new Vaihtoehto(
				KiviSaksetPaperi.KIVI, 
				KiviSaksetPaperi.KIVI, 
				KiviSaksetPaperi.KIVI);
		assertNotEquals(kivi, erilainenKivi);
	}
	

}
