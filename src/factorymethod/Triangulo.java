package factorymethod;


public class Triangulo extends Poligono {

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDescription() {
        return "Soy un triángulo ISÓSCELES";
    }

    @Override
    public double getSuperficie() {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo isósceles
        return 0;
    }

    @Override
    public void dibujate() {
        //Aquí iría el algoritmo para dibujar un triángulo isósceles.
        System.out.println("Dibujando un triángulo ISÓSCELES");
    }
}
