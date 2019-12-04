package boletin13;

public class Masajista extends Equipo{
    private String titulacion;
    private int anosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int anosExperiencia, int id, int nome, int apellido, int edad) {
        super(id, nome, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darmasaje(){
    System.out.println("Dando masaje");    
    }
    
    public void viajar(){
        System.out.println("viaxan os masajistas");
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Masajista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
    
    
}
