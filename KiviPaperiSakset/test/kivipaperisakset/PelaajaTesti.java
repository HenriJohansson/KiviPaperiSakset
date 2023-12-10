package kivipaperisakset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PelaajaTesti {

	private Pelaaja testaaja;

	@BeforeEach
	void setUp() throws Exception{
		testaaja = new Pelaaja();
	}

	@Test
	void eiVoittoja(){
		assertEquals(0, testaaja.getVoitot());
	}
	@Test
	void sataVoittoa(){
		for (int i = 0; i < 100; i++){
			testaaja.lisääVoitto();	
		}
		assertEquals(100, testaaja.getVoitot());
	}
	@Test
	void yksiVoitto(){
		testaaja.lisääVoitto();
		assertEquals(1, testaaja.getVoitot());
	}

}
