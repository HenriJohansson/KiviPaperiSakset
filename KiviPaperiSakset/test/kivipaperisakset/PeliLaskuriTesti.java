package kivipaperisakset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeliLaskuriTesti {

	private PeliLaskuri laskuri;
	private IPelaaja pelaajaKivi, pelaajaSakset, pelaajaPaperi;
	
	@BeforeEach
	void setUp() throws Exception{
		laskuri = new PeliLaskuri();
		pelaajaKivi = new TestiPelaajaKivi();
		pelaajaSakset = new TestiPelaajaSakset();
		pelaajaPaperi = new TestiPelaajaPaperi();
	}

	@Test
	void EräKiviVoittaa(){
		assertEquals(pelaajaKivi, laskuri.erä(pelaajaKivi, pelaajaSakset)); 
	}
	
	@Test
	void EräSaksetVoittaa(){
		assertEquals(pelaajaSakset, laskuri.erä(pelaajaSakset, pelaajaPaperi));
	}
	
	@Test
	void EräPaperiVoittaa(){
		assertEquals(pelaajaPaperi, laskuri.erä(pelaajaPaperi, pelaajaKivi));
	}
	
	@Test
	void EräTasapeli(){
		assertEquals(null, laskuri.erä(pelaajaKivi, pelaajaKivi)); 
	}

	@Test
	void GetPelatutErät(){
		laskuri.erä(pelaajaPaperi, pelaajaKivi);
		assertEquals(1, laskuri.getPelatutErät());
	}

	@Test
	void GetTasapelit(){
		laskuri.erä(pelaajaPaperi, pelaajaKivi);
		laskuri.erä(pelaajaKivi, pelaajaPaperi);
		laskuri.erä(pelaajaSakset, pelaajaSakset);
		assertEquals(1, laskuri.getTasapelit());
	}

}
