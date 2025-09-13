Caso Práctico 
Sistema de Gestión de Empleados 
Modelar una clase Empleado que represente a un trabajador en una empresa. 
Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso 
de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los 
objetos creados. 
CLASE EMPLEADO 
Atributos: 
● int id: Identificador único del empleado. 
● String nombre: Nombre completo. 
● String puesto: Cargo que desempeña. 
● double salario: Salario actual. 
● static int totalEmpleados: Contador global de empleados creados. 
REQUERIMIENTOS 
1. Uso de this: 
○ Utilizar this en los constructores para distinguir parámetros de 
atributos. 
2. Constructores sobrecargados: 
○ Uno que reciba todos los atributos como parámetros. 
○ Otro que reciba solo nombre y puesto, asignando un id 
automático y un salario por defecto. 
○ Ambos deben incrementar totalEmpleados. 
3. Métodos sobrecargados actualizarSalario: 
○ Uno que reciba un porcentaje de aumento. 
○ Otro que reciba una cantidad fija a aumentar. 
4. Método toString(): 
○ Mostrar id, nombre, puesto y salario de forma legible. 
5. Método estático mostrarTotalEmpleados(): 
○ Retornar el total de empleados creados hasta el momento. 
6. Encapsulamiento en los atributos: 
○ Restringir el acceso directo a los atributos de la clase. 
○ Crear los métodos Getters y Setters correspondientes. 
TAREAS A REALIZAR 
1. Implementar la clase Empleado aplicando todos los puntos anteriores. 
2. Crear una clase de prueba con método main que: 
○ Instancie varios objetos usando ambos constructores. 
○ Aplique los métodos actualizarSalario() sobre distintos 
empleados. 
○ Imprima la información de cada empleado con toString(). 
○ Muestre el total de empleados creados con 
mostrarTotalEmpleados(). 
● Usá this en los constructores para evitar errores de asignación. 
● Probá distintos escenarios para validar el comportamiento de los 
métodos sobrecargados. 
● Asegúrate de que el método toString() sea claro y útil para depuración. 
● Confirmá que el contador totalEmpleados se actualiza correctamente 
en cada constructor. 
CONCLUSIONES ESPERADAS 
● Comprender el uso de this para acceder a atributos de instancia. 
● Aplicar constructores sobrecargados para flexibilizar la creación de 
objetos. 
● Aplicar encapsulamiento en los atributos. 
● Implementar métodos con el mismo nombre y distintos parámetros. 
● Representar objetos con toString() para mejorar la depuración. 
● Diferenciar y aplicar atributos y métodos estáticos en Java. 
● Reforzar el diseño modular y reutilizable mediante el paradigma 
orientado a objetos.