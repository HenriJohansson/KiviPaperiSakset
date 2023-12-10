package kivipaperisakset;

public class Vaihtoehto {
	private KiviSaksetPaperi vaihtoEhto;
	private KiviSaksetPaperi voittaa, häviää;
	
	public Vaihtoehto(
			KiviSaksetPaperi vaihtoEhto
			, KiviSaksetPaperi voittaa
			, KiviSaksetPaperi häviää) {
		this.vaihtoEhto = vaihtoEhto;
		this.voittaa = voittaa;
		this.häviää = häviää;
	}
	
	public KiviSaksetPaperi getVaihtoEhto() {
		return vaihtoEhto;
	}
	
	public KiviSaksetPaperi getVoittaa(){
		return voittaa;
	}
	
	public KiviSaksetPaperi getHäviää(){
		return häviää;
	}
	
	public Vaihtoehto voittankoVertailu(Vaihtoehto vieras) {
		if(this.voittaa.equals(vieras.vaihtoEhto)) {
			return vieras;
		} else if (this.häviää.equals(vieras.vaihtoEhto)) {
			return this;
		} else {
			return null;
		}
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Vaihtoehto) {
			Vaihtoehto toinen = (Vaihtoehto) obj;
			if(
					this.vaihtoEhto == toinen.vaihtoEhto && 
					this.häviää == toinen.häviää && 
					this.voittaa == toinen.voittaa) {
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
}
