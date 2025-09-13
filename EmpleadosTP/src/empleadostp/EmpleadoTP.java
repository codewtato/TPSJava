package empleadostp;

public class EmpleadoTP {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Sistema de Gestión de Empleados");
        System.out.println("--------------------------------------------------");
// Creando empleado con todos los datos
        System.out.println("Creando empleado pasando todos los datos:");
        Empleado u1 = new Empleado(001, "Matias D' Agostino", "Desarrollador Web", 80000.0);
        Empleado u2 = new Empleado(002, "Javier Miguel", "Diseñador Grafica", 60000.0);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println("Total de empleados hasta ahora: " + Empleado.mostrarTotalEmpleados());
        System.out.println("--------------------------------------------------");

// Creando empleado con solo nombre y puesto
        System.out.println("Creando empleado pasando solo nombre y puesto:");
        Empleado u3 = new Empleado("Leo Messi", "Jefe de Proyecto");
        Empleado u4 = new Empleado("Paulo Dybala", "Soporte Técnico");

        System.out.println(u3);
        System.out.println(u4);
        System.out.println("Total de empleados hasta ahora: " + Empleado.mostrarTotalEmpleados());
        System.out.println("--------------------------------------------------");


// Aumentador de salarios usando porcentaje
        System.out.println("Vamos a aumentar salarios, primero usando porcentaje:");
        System.out.println("--------------------------------------------------");
        System.out.println("Aumentando salario de " + u1.getNombre() + " en un 10%");
        System.out.println("Salario antes del aumento: $" + u1.getSalario());
        u1.actualizarSalario(10.0);
        System.out.println("Salario después del aumento: $" + u1.getSalario());
        System.out.println("--------------------------------------------------");

        System.out.println("Aumentando salario de " + u2.getNombre() + " en un 15%");
        System.out.println("Salario antes del aumento: $" + u2.getSalario());
        u2.actualizarSalario(15.0);
        System.out.println("Salario después del aumento: $" + u2.getSalario());
        System.out.println("--------------------------------------------------");


// Aumentador de salarios usando monto fijo
        System.out.println("Ahora aumentando salarios usando un monto fijo:");
        System.out.println("--------------------------------------------------");
        System.out.println("Aumentando salario de " + u3.getNombre() + " en $5000");
        System.out.println("Salario antes del aumento: $" + u3.getSalario());
        u2.actualizarSalario(5000);
        System.out.println("Salario después del aumento: $" + u3.getSalario());
        System.out.println("--------------------------------------------------");

        System.out.println("Aumentando salario de " + u4.getNombre() + " en $7000");
        System.out.println("Salario antes del aumento: $" + u4.getSalario());
        u4.actualizarSalario(7000);
        System.out.println("Salario después del aumento: $" + u4.getSalario());

//Mostremos informacion actualizada de todos los empleados
        System.out.println("--------------------------------------------------");
        System.out.println("Información actualizada de todos los empleados:");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        System.out.println("--------------------------------------------------");

    }
    
}
