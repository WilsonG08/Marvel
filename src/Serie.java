public class Serie {
    String titulo;
    int numeroTemporadas=3;
    boolean entregrado=false;
    String genero;
    String creador;

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
}
