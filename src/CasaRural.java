package Inmuebles;
public class CasaRural extends Inmuebles.Casa {
    protected static double valor_area = 1500000;
    protected int distancia_cabera;
    protected int altitud;

    public CasaRural(int identificador_inmobiliario, int area, String direccion,
                     int numero_habitaciones, int numero_banos, int numero_pisos,
                     int distancia_cabera, int altitud) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones,
                numero_banos, numero_pisos);
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal = " +
                distancia_cabera + "kms");
        System.out.println("Altitud sobre el nivel del mar = " +
                altitud + "metros");
        System.out.println();
    }
}
