public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;
    private Motor motor;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = 0.0;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void rodar(double quilometros) {
        if (quilometros >= 0) {
            quilometragem += quilometros;
        }
    }

    public void exibirCarroInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void ligar() {
        System.out.println("Ligando o carro");
        if (motor != null) {
            motor.ligar();
        }
    }
}
