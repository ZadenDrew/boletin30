package boletin30;

/**
 *
 * @author andrea
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("O futbolista esta facendo unha entrevista");
    }

    @Override
    public String toString() {
        return super.toString() + "\n Futbolista --> Dorsal: " + dorsal + "- Demarcacion:" + demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("O futbolista esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O futbolista esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O futbolista esta entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O futbolista xoga o partido");
    }
}
