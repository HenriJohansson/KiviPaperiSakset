package kivipaperisakset;

public interface IPelaaja {
	public abstract Vaihtoehto pelaajanValinta();
    public abstract void lisääVoitto();
    public abstract int getVoitot();
}
