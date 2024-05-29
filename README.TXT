Arquitectura de 3 Capas
1. Capa de Presentación:
? Propósito: Interactúa con el usuario final, mostrando información y
recibiendo entradas.
? Ejemplo: Interfaz gráfica o consola que muestra la lista de ropa
disponible.

2. Capa de Lógica de Negocio:
? Propósito: Contiene las reglas y lógica de negocio, procesando datos y
realizando operaciones necesarias.
? Ejemplo: Gestión de operaciones como agregar productos, calcular
precios y validar stock.
3. Capa de Acceso a Datos:
? Propósito: Maneja la persistencia y recuperación de datos desde una base
de datos u otra fuente de almacenamiento.

? Ejemplo: Interacción con una base de datos para almacenar información
de productos y registrar compras.

Principios SOLID
1. SRP (Single Responsibility Principle):
? Principio: Una clase debe tener una única responsabilidad.
? Ejemplo: Clase Ropa se encarga solo de atributos de ropa; ServicioRopa
maneja la lógica de negocio.
2. OCP (Open/Closed Principle):
? Principio: Las clases deben estar abiertas para extensión pero cerradas
para modificación.
? Ejemplo: Nuevas implementaciones de RepositorioRopa sin modificar
clases existentes.

3. LSP (Liskov Substitution Principle):
? Principio: Los objetos de una clase base deben ser reemplazables por
objetos de una clase derivada.
? Ejemplo: RepositorioRopaEnMemoria puede reemplazar cualquier
implementación de RepositorioRopa.
4. ISP (Interface Segregation Principle):
? Principio: Los clientes no deben depender de interfaces que no utilizan.
? Ejemplo: RepositorioRopa define solo métodos necesarios para manejar
operaciones de ropa.

5. DIP (Dependency Inversion Principle):
? Principio: Las clases deben depender de abstracciones y no de
implementaciones concretas.
? Ejemplo: ServicioRopa depende de la interfaz RepositorioRopa, no de
una implementación concreta.

Patrones de Diseño
1. Patrón Creacional: Factory Method:
? Propósito: Define una interfaz para crear objetos y permite que las
subclases alteren el tipo de objeto creado.
? Ejemplo: FabricaRopa para crear instancias de Ropa.
2. Patrón Estructural: Adapter:
? Propósito: Permite que dos interfaces incompatibles trabajen juntas.

? Ejemplo: Adaptar diferentes fuentes de datos a la interfaz
RepositorioRopa.
3. Patrón Comportamiento: Strategy:
? Propósito: Define una familia de algoritmos, los encapsula y los hace
intercambiables.
? Ejemplo: Estrategias de cálculo de precios con descuentos o filtrado de
productos.