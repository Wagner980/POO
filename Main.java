public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
        System.out.println(quadrado.getLado());
        System.out.println(quadrado.getNome());

        System.out.println(triangulo.getAltura());
        System.out.println(triangulo.getBase());
        System.out.println(triangulo.getNome());

    }
}