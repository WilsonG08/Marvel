import java.util.Scanner;

public class Serie {
    String titulo;
    int numeroTemporadas;
    boolean entregrado;
    String genero;
    String creador;
    String aux;

    Scanner sc = new Scanner(System.in);
    public Serie(){
        titulo="Breaking Bad";
        numeroTemporadas=3;
        entregrado=false;
        genero="Accion";
        creador="Vince Gilligan";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isEntregrado() {
        return entregrado;
    }

    public void setEntregrado(boolean entregrado) {
        this.entregrado = entregrado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int menu ()
    {
        int op = 0;
        do {
            System.out.println("\n ->->->->-> MARVEL <-<-<-<-<-");
            System.out.println(" ================================= ");
            System.out.println("|1. Constructor por defecto       |");
            System.out.println("|2. Constructor titulo creador    |");
            System.out.println("|3. Constructor atributos         |");
            System.out.println("|0. Salir                         |");
            System.out.println(" ================================= ");
            System.out.print("Opcion: ");
            op = sc.nextInt();

        }while (op < 0 || op > 3);
        return op;
    }

    public void defecto(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Temporadas: " + getNumeroTemporadas());
        System.out.println("Entregado: " + entregrado);
        System.out.println("Genero: " + getGenero());
        System.out.println("Creador: " + getCreador());
    }

    public void titulo(){
        System.out.println("Contructor titulo y creador");

        setTitulo(aux);
        System.out.print("Ingrese el creador: ");
        aux = sc.nextLine();
        setCreador(aux);
    }
}
