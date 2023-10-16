package futbol;

public class Portero extends Futbolista{

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad,short golesRecibidos,byte dorsal){
        super(nombre,edad, "Portero");
        this.golesRecibidos=golesRecibidos;
        this.dorsal=dorsal;
    }

    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    public  boolean jugarConLasManos(){
        return true;
    }

    public int compareTo(Object f){
        Portero f1=(Portero)f;
        return Math.abs(golesRecibidos-f1.golesRecibidos);
    }
}