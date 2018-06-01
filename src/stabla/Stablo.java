package stabla;

import java.util.Map;

public abstract class Stablo<K, V> implements Map<K, V>{
	
	private CvorStabla<V> koren;

	public Stablo(CvorStabla<V> koren) {
		super();
		this.koren = koren;
	}
	
	public V pretragaPoKljucu(CvorStabla<V> k, Integer kljuc) {
		if(k == null) return null;
		if(k.kljuc == kljuc)
			return k.vrednost;
		if(k.levo != null && kljuc > k.levo.kljuc)
			return pretragaPoKljucu(k.levo, kljuc);
		else if(k.desno != null && kljuc < k.desno.kljuc)
			return pretragaPoKljucu(k.desno, kljuc);
		return null;
	}

}
