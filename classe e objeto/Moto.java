public class Moto {
    private String marca;
    private String cor;
    private int ano;

    public Moto(String marca, String cor, int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void darGrau(){
        System.out.println("dando grau");
    }
    public void cortaGiro(){
        System.out.println("está cortando giro");
    }
    public void passageiro(){
        System.out.println("passageiro subiu na magrelinha");
    }
}

