package factorymethod;

public abstract class Poligono {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int numlados;

    //Constructor
    public Poligono(int ladoA, int ladoB, int ladoC, int numlados) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.numlados = numlados;
    }

    public Poligono(int ladoA) {
    }

    public Poligono(int ladoA, int ladoB) {
    }
    public int getLadoA() { return ladoA; }
    public int getLadoB() { return ladoB; }
    public int getLadoC() { return ladoC; }

    public int getNumlados() { return numlados; }

    public void setLadoA(int ladoA) { this.ladoA = ladoA; }
    public void setLadoB(int ladoB) { this.ladoB = ladoB; }
    public void setLadoC(int ladoC) { this.ladoC = ladoC; }
    public void setNumlados(int numlados) { this.numlados = numlados; }
    
    //Métodos a redefinir por las subclases
    public abstract String getDescription();
    
    public abstract double getSuperficie();
    
    public abstract void dibujate();   
}
