package Inmuebles;
public class Prueba {
    public static void main(String args[]) {
        Inmuebles.ApartamentoFamiliar apto1 = new
                Inmuebles.ApartamentoFamiliar(103067,120,
                "Avenida Santander 45-45",3,2,
                200000);
        System.out.println("Datos apartamento");
        apto1.calcular_precio_venta(apto1.valor_area);
        apto1.imprimir();

        System.out.println("Datos apartamento");
        Inmuebles.ApartaEstudio aptestudio1 = new
                Inmuebles.ApartaEstudio(12354,50,
                "Avenida Caracas 30-15",1,1);
        aptestudio1.calcular_precio_venta(aptestudio1.valor_area);
        aptestudio1.imprimir();
    }
}
