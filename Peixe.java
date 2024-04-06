public class Peixe extends Animal {
    private String caracteristicas;
    public Peixe(String nome,double comprimento,int numPatas,String cor,String ambiente,double velocidadeMedia,String caracteristicas){
        super(nome,comprimento,numPatas,cor,ambiente,velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }
    public String getCaracteristicas(){
        return caracteristicas;

    }
    public void setCaracteristicas(String caracteristicas){
        this.caracteristicas=caracteristicas;
    }
    public void dadosPeixe(){
        super.dados();
        System.out.println("Caracteristicas"  + caracteristicas);
    }
}
