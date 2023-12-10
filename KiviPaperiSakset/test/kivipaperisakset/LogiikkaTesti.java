package kivipaperisakset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogiikkaTesti {
	private ILogiikka logiikka = Logiikka.getInstance();
	@BeforeEach
	void setUp() throws Exception{
		this.logiikka = Logiikka.getInstance();
	}

	@Test
	void GetInstance(){
		assertEquals(logiikka, Logiikka.getInstance());
	}

	@Test
	void VoittaakoKivi(){
		assertEquals(1, this.logiikka.voittaako(
				logiikka.getVaihtoehto(KiviSaksetPaperi.KIVI), 
				logiikka.getVaihtoehto(KiviSaksetPaperi.SAKSET)));
	}
	@Test
	void EiköVoitta(){
		assertEquals(-1, this.logiikka.voittaako(
				logiikka.getVaihtoehto(KiviSaksetPaperi.PAPERI), 
				logiikka.getVaihtoehto(KiviSaksetPaperi.SAKSET)));
	}
	@Test
	void Tasapeli(){
		assertEquals(0, this.logiikka.voittaako(
				logiikka.getVaihtoehto(KiviSaksetPaperi.KIVI), 
				logiikka.getVaihtoehto(KiviSaksetPaperi.KIVI)));
	}

	@Test
	void GetVaihtoehto(){
		assertEquals(
				new Vaihtoehto(KiviSaksetPaperi.KIVI, KiviSaksetPaperi.PAPERI, KiviSaksetPaperi.SAKSET),
				logiikka.getVaihtoehto(KiviSaksetPaperi.KIVI));
	}

}
