public class ImprimirNombre {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose", "Heriberto");
        Empleado e2 = new Empleado("Juan", "Benjamin");
        Empleado e3 = new Empleado("Olga", "Marco");

        Empleado[] empleados = new Empleado[3];
        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;

        System.out.println();
        for (Empleado empleadoActual : empleados) {
            System.out.println("Empleado: " + empleadoActual.nombre + " "+ empleadoActual.apellido);
        }
    }
}