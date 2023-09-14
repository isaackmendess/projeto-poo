public class CarroEsportivo extends Carro {
    private int velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, int velocidadeMaxima) {
        super(marca, modelo, ano);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro esportivo!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Velocidade Máxima: " + velocidadeMaxima;
    }
}
