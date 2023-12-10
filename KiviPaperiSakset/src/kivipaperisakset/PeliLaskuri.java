package kivipaperisakset;

public class PeliLaskuri {
	protected ILogiikka säännöt;
	private int pelatutErät = 0;           // Pelattujen pelien lkm
    private int tasapelit = 0;              // Tasapelien lkm
    public PeliLaskuri() {
    	säännöt = Logiikka.getInstance();
	}
    
	public IPelaaja erä(IPelaaja p1, IPelaaja p2) {
		pelatutErät++;
		int tulos = säännöt.voittaako(p1.pelaajanValinta(), p2.pelaajanValinta());
		switch(tulos) {
		case 1:
			System.out.println("Pelaaja 1 voittaa");
			return p1;
		case -1: 
			System.out.println("Pelaaja 2 voittaa");
			return p2;
		default: 
			System.out.println("\n\t\t\t Tasapeli \n");
			tasapelit++;
			return null;
		}
	}
	
	public int getPelatutErät(){
		return pelatutErät;
	}
	
	public int getTasapelit(){
		return tasapelit;
	}
}
