package lab3_carlosromero;

public class Tiendas extends Locales{
    private int Tamanio;

    public Tiendas() {
        super();
    }

    public Tiendas(int Tamanio) {
        this.Tamanio = Tamanio;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int Tamanio) {
        this.Tamanio = Tamanio;
    }

    @Override
    public String toString() {
        return super.toString()+"Tiendas\n" + "Tamaño=" + Tamanio;
    }
    
    
}
