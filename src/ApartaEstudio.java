package Inmuebles;
public class ApartaEstudio extends Inmuebles.Apartamento {
    protected static double valor_area = 1500000;

    public ApartaEstudio(int identificador_inmobiliario, int area, String direccion,
                         int numero_habitaciones, int numero_banos) {
        super(identificador_inmobiliario, area, direccion, 1,1);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
