package boletin30;

/**
 *
 * @author andrea
 */
public class Seleccionador extends SeleccionFutbol {

    private int id, edad;
    private String nome, apelidos;

    public Seleccionador() {
    }

    public Seleccionador(int id, int edad, String nome, String apelidos) {

        super(id, edad, nome, apelidos);
    }

    public void seleccionarXogador() {
        System.out.println("O seleccionador seleciona un xogador");
    }

    @Override
    public String toString() {
        return ("Seleccionador -> " + super.toString());
    }

    @Override
    public void concentrarse() {
        System.out.println("O Seleccionador esta concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("O Seleccionador esta viaxando");
    }

    @Override
    public void entrenar() {
        System.out.println("O Seleccionador esta entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O Seleccionador xoga o partido");
    }
}
