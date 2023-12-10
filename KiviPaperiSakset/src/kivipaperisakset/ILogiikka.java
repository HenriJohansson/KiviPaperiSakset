package kivipaperisakset;

public interface ILogiikka {
	public abstract int voittaako(Vaihtoehto oma, Vaihtoehto vastustaja);
	public abstract Vaihtoehto getVaihtoehto(KiviSaksetPaperi vaihtoehto);
}
