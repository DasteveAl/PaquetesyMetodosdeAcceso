package Inmuebles;
public class Oficina extends Inmuebles.Local {
    protected static double valor_area = 3500000;
    protected boolean es_gobierno;

    public Oficina(int identificador_inmobiliario, int area, String direccion,
                   tipo tipo_local, boolean es_gobierno) {
        super(identificador_inmobiliario, area, direccion, tipo_local);
        this.es_gobierno = es_gobierno;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gobernamenetal = " + es_gobierno);
        System.out.println();
    }
}
