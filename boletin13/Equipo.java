package boletin13;

public class Equipo {
    private int id;
    private int nome;
    private int apellido;
    private int edad;

    public Equipo() {
    }

    public Equipo(int id, int nome, int apellido, int edad) {
        this.id = id;
        this.nome = nome;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public void setApellido(int apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public int getNome() {
        return nome;
    }

    public int getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void concertrarse(){
        System.out.println("concentrase a selección");
    }
    public void viajar(){
        System.out.println("viaxa a selección");
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nome=" + nome + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    
}
