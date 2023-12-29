public class Main {
    public static void main(String[] args) {
        TermometroGeladeira termometro = new TermometroGeladeira(4.0);

        termometro.registrarTemperatura(5.0);
        termometro.registrarTemperatura(3.0);
        termometro.registrarTemperatura(7.0);

        System.out.println("Temperatura Atual: " + termometro.getTemperaturaAtual());
        System.out.println("Temperatura Mínima: " + termometro.getTemperaturaMinima());
        System.out.println("Temperatura Máxima: " + termometro.getTemperaturaMaxima());
    }
}
