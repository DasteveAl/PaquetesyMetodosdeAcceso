package Inmuebles;
public class CasaIndependiente extends Inmuebles.CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificador_inmobiliario, int area,
                             String direccion, int numero_habitaciones,
                             int numero_banos, int numero_pisos) {
        super(identificador_inmobiliario, area, direccion,
                numero_habitaciones, numero_banos, numero_pisos);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
