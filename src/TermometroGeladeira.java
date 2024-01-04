import java.time.LocalDateTime;
import java.time.LocalTime;

public class TermometroGeladeira {
    private double temperaturaAtual;
    private double temperaturaMinima = Double.MAX_VALUE;
    private double temperaturaMaxima = Double.MIN_VALUE;
    private LocalDateTime horarioRegistro;
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
    public LocalDateTime getHorarioRegistro(){
        return horarioRegistro;
    }

    public void registrarTemperatura(double novaTemperatura) {
        this.temperaturaAtual = novaTemperatura;
        this.horarioRegistro=LocalDateTime.now();
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
