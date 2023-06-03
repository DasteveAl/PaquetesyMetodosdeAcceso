package Inmuebles;
public class Local extends Inmuebles.Inmueble {
    enum tipo {INTERNO, CALLE};
    protected tipo tipo_local;

    public Local(int identificador_inmobiliario, int area, String direccion,
                 tipo tipo_local) {
        super(identificador_inmobiliario, area, direccion);
        this.tipo_local = tipo_local;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipo_local);
    }
}
