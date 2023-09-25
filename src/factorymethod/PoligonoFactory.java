package factorymethod;

public class PoligonoFactory implements PoligonoFactoryMethod extends Poligono {

    @Override
    public Poligono createPoligono(int ladoA, int ladoB, int ladoC) {
        
        if (numlados == 0){
            return new Circulo(ladoA);
        }
        else if ( (numlados == 1) {
            return new Cuadrado(ladoA, ladoB);
        }
        else {
            return new Triangulo(ladoA, ladoB, ladoC);
        }
    }
}
