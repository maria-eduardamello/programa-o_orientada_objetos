public class Livro {

    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    public Livro(String titulo, Autor autor, int ano, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = emprestado;
    }

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        }
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        }
    }
}