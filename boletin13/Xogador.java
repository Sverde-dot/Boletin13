package boletin13;

public class Xogador extends Equipo {
    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion, int id, int nome, int apellido, int edad) {
        super(id, nome, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarpartido(){
    System.out.println("Jugando el parido");    
    }
    
    public void entrenar(){
        System.out.println("Entrenando");
    }
    
    public void viajar(){
        System.out.println("viaxan os xogadores");
    }
    @Override
    public String toString() {
        return super.toString()+ "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
    
}
