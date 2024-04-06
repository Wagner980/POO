public class Triangulo implements FiguraGeometrica {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;
    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base=base;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public int getLadio1(){
        return lado1;
    }
    public void setLado1(int lado1){
        this.lado1=lado1;
    }
    public int getLado2(){
        return lado2;
    }
    public void setLado2(int lado2){
        this.lado2=lado2;
    }
    public int getLado3(){
        return lado3;
    }
    public void setLado3(int lado3){
        this.lado3=lado3;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = (base * altura)/2;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro=0;
        perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    @Override
    public String getNome() {
        return "Triangulo";
    }
}
