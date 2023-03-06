# Talleres 4: POO y modelamiento de objetos - Cantera 2 - Sofka.

## Tabla De Contenido.
1. [Información General](#información-general)
2. [Requerimientos](#requerimientos)
3. [Instalación](#instalación)
4. [Implementación](#implementación)
5. [Tecnologías](#tecnologías)
6. [Enlaces](#enlaces)
7. [Autor](#autor)


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Información General

Ejercicios # 4 Sofka: POO y modelamiento de objetos.
A continuación encontrará los puntos desarrollados del proyecto.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Requerimientos

En la siguiente lista de ejercicios realice de forma individual cada una de ellas.
Cada ejercicio se debe entregar en un único repositorio de Git, separe cada ejercicio en subcarpetas.

Ejercicio #1
Desarrolle una clase en Java que realice la abstracción de un sistema planetario, debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa, densidad, diámetro, distancia al sol (suponga órbitas circulares), un número de identificador único y un nombre textual. Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del sistema.

Ejercicio #2
¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

Ejercicio #3
Escriba un programa en java que genere aleatoriamente (Ayuda: Vea la clase Math para saber cómo generar números aleatorios en java) un array de números reales, y lo ordene mediante el algoritmo de la burbuja o mediante quick sort (esto deberá poder elegirlo el usuario).

Ejercicio #4
Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo. Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, número de ruedas, fecha de matriculación, medio por el que se desplaza, etc. Incluya los métodos que considere oportunos. Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.

Ejercicio #5
A partir de la clase anterior, y mediante herencia, cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un camión, una bicicleta, una lancha. Incluya en cada clase algún atributo específico que la diferencie de las demás. Por ejemplo, para el coche un booleano que determine si es de tres o cinco puertas, para el camión la altura (indiferente en los otros vehículos), etc. Realice un programa como el del ejercicio anterior capaz de trabajar con los distintos tipos de vehículos.

Ejercicio #6
Una interesante clase predefinida en el lenguaje java es la clase Vector, que implemente la abstracción "array dinámico". Revise la clase y úsela (en ficheros diferentes) para realizar un programa que lea números del teclado hasta que se introduce dos veces seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Instalación

1.  Abrir la terminal del Windows.

2.  Si no tiene conocimiento de la terminal, ingrese al siguiente link para que realice una breve introducción: https://learn.microsoft.com/es-es/windows/terminal/ 

3.  Clonar el repositorio colocando el la terminal de Windows el comando: git clone https://github.com/Mendoalon/Taller-4-modelamiento-de-objetos.git

4.  Abrir el ide netbeans.

5.  En caso de no tener instalado el ide netbeans puede ingresar al siguiente enlace para su descarga e instalación: https://netbeans.apache.org/download/index.html

6.  Tener el ide netbeans abierto y ubicarse en la barra superior, en la pestaña file, daler click y selecionar open project.

7.  Abrir el proyecto clonado de nombre: Taller-4-modelamiento-de-objetos.

8.  Encontrará 6 subcarpetas las cuales contienes los 6 ejercicios requeridos, cada subcarpetas tiene una clase main principal, las cuales son: MainOne, MainTwo,           MainThree, MainFour, MainFive y MainSix.

9.  Ubicarse en la clase Main del ejercicio que quiere ejecutar.

10. En el método main public static void main(String[] args) realizar clic derecho y seleccionar run file.

11. Se abrirá la consola con un menú, siga las instrucciones que le muestra.


------------------------------------------------------------------------------------------------------------------------
### Implementación

Ejercicio #1
En este proyecto se implementaron 4 clases, las cuales son:

1) MainOne: Clase principal donde ejecutamos nuestra aplicación la cual tiene un menú de opciones.
2) PlanetInterface: Clase Interfaces donde creamos los métodos a usar.
3) PlanetarySystem: Clase sistema planetario donde sobreescribimos los métodos de la interface y creamos las funcionalidades.
4) Planet: Clase donde declaramos los atributos de los planetas.
5) Cada clase cuenta con la documentación necesaria para su entendimiento.

Ejercicio #2
En este proyecto se implementó 1 clases, la cual es:

1) MainTwo: Clase principal donde ejecutamos nuestra aplicación la cual tiene un menú de opciones.
2) la clase cuenta con la documentación necesaria para su entendimiento.

Ejercicio #3
En este proyecto Se implementaron 3 clases, las cuales son:

1) MainThree: Clase principal donde ejecutamos nuestra aplicación la cual tiene un menú de opciones.
2) MethodsInteface: Clase Interfaces donde creamos los métodos a usar.
3) Methods: Clase metodos donde implementamos la clase MethodsInteface y sobreescribimos los métodos de la interface.
4) Cada clase cuenta con la documentación necesaria para su entendimiento.

Ejercicio #4
En este proyecto se implementaron 3 clases, las cuales son:

1) MainFour: Clase principal donde ejecutamos nuestra aplicación la cual tiene un menú de opciones.
2) VehicleInterface: Clase Interfaces donde creamos los métodos a usar.
3) Vehicle: Clase vehículo donde implementamos la clase VehicleInterface y sobreescribimos los métodos de la interface.
4) Cada clase cuenta con la documentación necesaria para su entendimiento.

Ejercicio #5
En este proyecto Se implementaron 8 clases, las cuales son:

1) MainFive: Clase principal donde ejecutamos nuestra aplicación.
2) Bicicleta: Sub clase bicicleta donde heredamos de la clase Vehicle ubicada el el ejercicio # 4. Extendemos sus atributos y declaramos los propios de la subclase.
3) Camion: Sub clase camion donde heredamos de la clase Vehicle ubicada el el ejercicio # 4. Extendemos sus atributos y declaramos los propios de la subclase.
4) Coche: Sub clase coche donde heredamos de la clase Vehicle ubicada el el ejercicio # 4. Extendemos sus atributos y declaramos los propios de la subclase.
5) Lancha: Sub clase lancha donde heredamos de la clase Vehicle ubicada el el ejercicio # 4. Extendemos sus atributos y declaramos los propios de la subclase.
6) Moto: Sub clase moto donde heredamos de la clase Vehicle ubicada el el ejercicio # 4. Extendemos sus atributos y declaramos los propios de la subclase.
7) Menu: La cual tiene un menú de opcionesy funcionalidadpara la creación de diferentes vehículos.
8) Cada clase cuenta con la documentación necesaria para su entendimiento.

Ejercicio #6
En este proyecto Se implementaron 2 clases, las cuales son:

1) MainSix: Clase principal donde ejecutamos nuestra aplicación, la cual tiene un menú de opciones.
2) Game: Clase Juego donde creamos la funciona jugar.
3) Cada clase cuenta con la documentación necesaria para su entendimiento.


------------------------------------------------------------------------------------------------------------------------
### Tecnologías

El taller fue desarrollado usando las siguientes herramientas:
- Creado con Java Maven.
- Tecnología: Java Versión 17.0.6.
- IDE: Netbeans.



------------------------------------------------------------------------------------------------------------------------
### Enlaces  

1. Enlace del repositorio GitHub: https://github.com/Mendoalon/Taller-4-modelamiento-de-objetos.git


------------------------------------------------------------------------------------------------------------------------

### Autor  
 # Luis Alberto Mendoza Alonso.
 
