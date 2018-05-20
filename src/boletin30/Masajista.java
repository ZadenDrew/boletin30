package boletin30;

/**
 *
 * @author andrea
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Masajista -> Titulacion: " + titulacion + "  Anos de Experiencia: " + aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("O masajista da masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("O masaxista esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O masaxista esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O masaxista esta entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O masaxista xoga o partido");
    }

}
