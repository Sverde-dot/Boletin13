package boletin13;

public class Entrenador extends Equipo {
   private String idFederacion; 

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, int nome, int apellido, int edad) {
        super(id, nome, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
   
    public void dirigirpartido(){
    System.out.println("Dirigiendo el partido");    
    }
    
    public void dirigirentrenar(){
    System.out.println("Dirigiendo el entrenamiento");    
    }
    
    public void viajar(){
        System.out.println("viaxan el entrenador");
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
   
   
}
