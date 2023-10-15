package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}

	public Jugador(String n, int e, String p, short g, byte d) {
		super(n, e, p);
		golesMarcados = g;
		dorsal = d;
	}

	@Override
	public int compareTo(Futbolista o) {
		int dif = this.getEdad() - o.getEdad();
		return Math.abs(dif);
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

}
