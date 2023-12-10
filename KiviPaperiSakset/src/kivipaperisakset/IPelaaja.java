package kivipaperisakset;
/**
 * 
 * @author Henri Johansson
 * Pelaaja template, mitä pelaaja vähintään vaatii
 */
public interface IPelaaja {
	public abstract Vaihtoehto pelaajanValinta();
    public abstract void lisääVoitto();
    public abstract int getVoitot();
}
