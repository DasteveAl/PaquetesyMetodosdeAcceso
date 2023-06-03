package Inmuebles;
public class LocalComercial extends Inmuebles.Local {
    protected static double valor_area = 3000000;
    protected String centro_comercial;

    public LocalComercial(int identificado_inmobiliario, int area, String direccion,
                          tipo tipo_local, String centro_comercial) {
        super(identificado_inmobiliario, area, direccion, tipo_local);
        this.centro_comercial = centro_comercial;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centro_comercial);
        System.out.println();
    }
}
