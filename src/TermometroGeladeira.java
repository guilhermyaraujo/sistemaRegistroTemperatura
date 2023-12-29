public class TermometroGeladeira {
    private double temperaturaAtual;
    private double temperaturaMinima = Double.MAX_VALUE;
    private double temperaturaMaxima = Double.MIN_VALUE;

    public TermometroGeladeira(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
        atualizarMinMax(temperaturaAtual);
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void registrarTemperatura(double novaTemperatura) {
        this.temperaturaAtual = novaTemperatura;
        atualizarMinMax(novaTemperatura);
    }

    private void atualizarMinMax(double novaTemperatura) {
        if (novaTemperatura < temperaturaMinima) {
            temperaturaMinima = novaTemperatura;
        }
        if (novaTemperatura > temperaturaMaxima) {
            temperaturaMaxima = novaTemperatura;
        }
    }
}
