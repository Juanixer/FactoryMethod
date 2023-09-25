package factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        PoligonoFactoryMethod factoria = new PoligonoFactory();
        Poligono circulo = factoria.createCirculo(10);
        Poligono cuadrado = factoria.createCuadrado(10, 20);
        Poligono triangulo = factoria.createTriangulo(10, 10, 10);

        System.out.println("********** POLÍGONOS GENERADOS **********");
        System.out.println("Polígono 1: " + circulo.getDescription());
        System.out.println("Polígono 2: " + cuadrado.getDescription());
        System.out.println("Polígono 3: " + triangulo.getDescription());
    }
}
