public class Iva {

    public static void main(String[] args) {
        calcularIva(150000d);

    }
    static void calcularIva(double precio){
        double resultado = precio * 1.19;
        System.out.println("precio con iva incluido = " + resultado);

    }
}
