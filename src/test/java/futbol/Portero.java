package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String n, int e, short g, byte d) {
		super(n, e, "Portero");
		golesRecibidos = g;
		dorsal = d;
	}

	@Override
	public int compareTo(Futbolista o) {
		Portero p = (Portero) o;
		int dif = this.golesRecibidos - p.golesRecibidos;
		return Math.abs(dif);
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;		
	}

}
