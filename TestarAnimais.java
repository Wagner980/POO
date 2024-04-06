public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("camelo",1.50,4,"amarelo","terra",2,"mato");
        camelo.dadosMamifero();
        Peixe tubarao = new Peixe("tubarao",3.0,0,"cinzento","mar",1.5,"barbatanas e cauda");
        tubarao.dadosPeixe();
        Mamifero ursocanada = new Mamifero("Urso-docanadá",1.80,4,"vermelho","terra",0.5,"mel");
        ursocanada.dadosMamifero();
    }
}
