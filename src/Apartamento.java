package Inmuebles;
public class Apartamento extends Inmuebles.InmuebleVivienda {
    public Apartamento(int identificador_inmobiliario, int area, String direccion,
                       int numero_habitaciones, int numero_banos) {
        super(identificador_inmobiliario, area, direccion,
                numero_habitaciones, numero_banos);
    }

    void imprimir() {
        super.imprimir();
    }
}
