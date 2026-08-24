import java.time.LocalDate;

public class Consulta {

    Paciente paciente;
    LocalDate data;
    double valor;

    public Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    public void exibirComprovante() {
        System.out.println("----- COMPROVANTE -----");
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$ " + valor);
        System.out.println("-----------------------");
    }

    public void remarcar(LocalDate novaData) {
        this.data = novaData;
    }
}