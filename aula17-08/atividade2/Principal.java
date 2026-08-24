import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Maria", "99999-1111");
        Paciente paciente2 = new Paciente("João", "99999-2222");

        Consulta consulta1 = new Consulta(
                paciente1,
                LocalDate.of(2026, 8, 25),
                200.00
        );

        Consulta consulta2 = new Consulta(
                paciente2,
                LocalDate.of(2026, 8, 26),
                250.00
        );

        consulta1.exibirComprovante();
        consulta2.exibirComprovante();

        consulta1.remarcar(LocalDate.of(2026, 9, 1));

        consulta1.exibirComprovante();
    }
}