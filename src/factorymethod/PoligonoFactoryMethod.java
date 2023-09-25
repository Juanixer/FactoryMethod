package factorymethod;

public interface PoligonoFactoryMethod {
    public Triangulo createTriangulo(int ladoA, int ladoB, int ladoC);
    public Cuadrado createCuadrado(int ladoA, int ladoB);
    public Circulo createCirculo(int ladoA);
    
}
