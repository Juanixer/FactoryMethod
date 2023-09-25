package factorymethod;

public class Circulo extends Poligono {

    public Circulo(int ladoA) {
        super(ladoA);
    }

    @Override
    public String getDescription() {
        return "Soy un triángulo EQUILATERO";
    }

    @Override
    public double getSuperficie() {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo equilatero
        return 0;
    }

    @Override
    public void dibujate() {
        //Aquí iría el algoritmo para dibujar un triángulo equilatero.
        System.out.println("Dibujando un triángulo EQUILATERO");
    }
}
