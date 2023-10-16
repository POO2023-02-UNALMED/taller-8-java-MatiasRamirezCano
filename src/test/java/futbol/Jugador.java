package futbol;
public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre,edad, posicion);
        this.golesMarcados=golesMarcados;
        this.dorsal=dorsal;
    }

    public Jugador(){
        super();
        this.dorsal=7;
        this.golesMarcados=289;
    }

    public  String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    public  boolean jugarConLasManos(){
        if (super.getPosicion().equals("Portero")){
            return true;
        }else{
            return false;
        }
    }

    public int compareTo(Object f){
        Futbolista f1=(Futbolista)f;
        return Math.abs(super.getEdad()-f1.getEdad());
    }

}
