package Inmuebles;
public class Casa extends Inmuebles.InmuebleVivienda {
    protected int numero_pisos;

    public Casa(int identificador_inmobiliario, int area, String direccion,
                int numero_habitaciones, int numero_banos, int numero_pisos) {
        super(identificador_inmobiliario, area, direccion,
                numero_habitaciones, numero_banos);
        this.numero_pisos = numero_pisos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos = " + numero_pisos);
    }
}
