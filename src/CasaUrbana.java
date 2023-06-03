package Inmuebles;
public class CasaUrbana extends Inmuebles.Casa {
    public CasaUrbana(int identificador_inmobiliario, int area,
                      String direccion, int numero_habitaciones,
                      int numero_banos, int numero_pisos) {
        super(identificador_inmobiliario, area, direccion,
                numero_habitaciones, numero_banos, numero_pisos);
    }

    void imprimir() {
        super.imprimir();
    }
}
