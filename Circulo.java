public class Circulo implements FiguraGeometrica {
    private double raio;
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }

    @Override
    public double getArea() {
        double area =0;
        double pi = 3.14;
        area = (raio*raio) * pi;
        return area;
    }

    @Override
    public double getPerimetro() {
        double Perimetro=0;
        double pi = 3.14;
        Perimetro  = 2*raio * pi;
        return Perimetro;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }
}