Arquitectura de 3 Capas
1. Capa de Presentaci�n:
? Prop�sito: Interact�a con el usuario final, mostrando informaci�n y
recibiendo entradas.
? Ejemplo: Interfaz gr�fica o consola que muestra la lista de ropa
disponible.

2. Capa de L�gica de Negocio:
? Prop�sito: Contiene las reglas y l�gica de negocio, procesando datos y
realizando operaciones necesarias.
? Ejemplo: Gesti�n de operaciones como agregar productos, calcular
precios y validar stock.
3. Capa de Acceso a Datos:
? Prop�sito: Maneja la persistencia y recuperaci�n de datos desde una base
de datos u otra fuente de almacenamiento.

? Ejemplo: Interacci�n con una base de datos para almacenar informaci�n
de productos y registrar compras.

Principios SOLID
1. SRP (Single Responsibility Principle):
? Principio: Una clase debe tener una �nica responsabilidad.
? Ejemplo: Clase Ropa se encarga solo de atributos de ropa; ServicioRopa
maneja la l�gica de negocio.
2. OCP (Open/Closed Principle):
? Principio: Las clases deben estar abiertas para extensi�n pero cerradas
para modificaci�n.
? Ejemplo: Nuevas implementaciones de RepositorioRopa sin modificar
clases existentes.

3. LSP (Liskov Substitution Principle):
? Principio: Los objetos de una clase base deben ser reemplazables por
objetos de una clase derivada.
? Ejemplo: RepositorioRopaEnMemoria puede reemplazar cualquier
implementaci�n de RepositorioRopa.
4. ISP (Interface Segregation Principle):
? Principio: Los clientes no deben depender de interfaces que no utilizan.
? Ejemplo: RepositorioRopa define solo m�todos necesarios para manejar
operaciones de ropa.

5. DIP (Dependency Inversion Principle):
? Principio: Las clases deben depender de abstracciones y no de
implementaciones concretas.
? Ejemplo: ServicioRopa depende de la interfaz RepositorioRopa, no de
una implementaci�n concreta.

Patrones de Dise�o
1. Patr�n Creacional: Factory Method:
? Prop�sito: Define una interfaz para crear objetos y permite que las
subclases alteren el tipo de objeto creado.
? Ejemplo: FabricaRopa para crear instancias de Ropa.
2. Patr�n Estructural: Adapter:
? Prop�sito: Permite que dos interfaces incompatibles trabajen juntas.

? Ejemplo: Adaptar diferentes fuentes de datos a la interfaz
RepositorioRopa.
3. Patr�n Comportamiento: Strategy:
? Prop�sito: Define una familia de algoritmos, los encapsula y los hace
intercambiables.
? Ejemplo: Estrategias de c�lculo de precios con descuentos o filtrado de
productos.