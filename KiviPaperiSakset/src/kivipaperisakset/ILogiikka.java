package kivipaperisakset;
/**
 * 
 * @author Henri Johansson
 * Logiikka template peli logiikoille.
 *
 */
public interface ILogiikka {
	public abstract int voittaako(Vaihtoehto oma, Vaihtoehto vastustaja);
	public abstract Vaihtoehto getVaihtoehto(KiviSaksetPaperi vaihtoehto);
}
