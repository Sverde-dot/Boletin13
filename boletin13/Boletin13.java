package boletin13;

public class Boletin13 {

    public static void main(String[] args) {
        Equipo obx = new Equipo();
        obx.toString();
        obx.concertrarse();
        obx.viajar();
        Equipo xog = new Xogador();
        xog.viajar();
        Equipo ent = new Entrenador();
        xog.viajar();
        Equipo mas = new Masajista();
        xog.viajar();
    }
    
}
