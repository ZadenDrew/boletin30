package boletin30;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrea
 */
public class Aplicacion {

    List<SeleccionFutbol> listaIntegrantes = new ArrayList();

    public List<SeleccionFutbol> crearArray() {
        SeleccionFutbol futbolista = new Futbolista(13, "delatero", 1214,24, "Juan", "Lopez");
        SeleccionFutbol entrenador = new Entrenador(1500, 2244,22, "Pepe", "Perez");
        SeleccionFutbol masajista = new Masajista("Fisioterapeuta", 4, 3333,23, "Lola", "Lopez");
        SeleccionFutbol seleccionador = new Seleccionador(4444,35, "Ramiro", "Lopez");

        listaIntegrantes.add(futbolista);
        listaIntegrantes.add(masajista);
        listaIntegrantes.add(entrenador);
        listaIntegrantes.add(seleccionador);

        return listaIntegrantes;
    }

    public void mostrarIntegrantes() {
        List<SeleccionFutbol> integrantes = crearArray();

        for (SeleccionFutbol el : integrantes) {
            System.out.println(el.toString());

        }
    }
}
