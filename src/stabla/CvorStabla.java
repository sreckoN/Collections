package stabla;

public abstract class CvorStabla<V> {

	public Integer kljuc;
	public V vrednost;
	public CvorStabla<V> levo;
	public CvorStabla<V> desno;
	
	public CvorStabla(Integer kljuc, V vrednost, CvorStabla<V> levo, CvorStabla<V> desno) {
		super();
		this.kljuc = kljuc;
		this.vrednost = vrednost;
		this.levo = levo;
		this.desno = desno;
	}
	
}
