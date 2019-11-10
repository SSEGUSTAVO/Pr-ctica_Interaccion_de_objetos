# Practica_interaccion_de_objetos

Escribir un programa Java que modele las propiedades, los comportamientos y las interacciones de los objetos en el salón recreativo. También necesitará una clase de prueba que contenga un método main. Utilice el método main para modelar las acciones que controlarán el programa, como las instanciaciones y las lecturas de tarjeta. Todos los campos deben ser private. Proporcione el método getter y los métodos setter necesarios.

Tarjetas 
La banda magnética de las tarjetas de juego ofrece poco espacio de almacenamiento y ninguna potencia informática. Las tarjetas almacenan información sobre su saldo de créditos actual, el saldo de tickets y el número de tarjeta. Ninguno de los saldos debe ser negativo. Las tarjetas no pueden realizar cálculos, incluida una simple suma, ni determinar que sus saldos podrían ser negativos. 
Todas las tarjetas se crean con un número de identificación entero único. Aunque cada tarjeta no puede hacer una simple suma, es posible realizar cálculos con las propiedades que pertenecen a todas las tarjetas. 
  
Juegos 
Los juegos requieren un determinado número de créditos para poder jugar. Cada juego está equipado con un lector de tarjetas magnéticas y una pantalla LCD. Al leer una tarjeta se reduce su saldo de créditos, pero genera un número no negativo aleatorio de tickets. Se imprime el número de tarjeta, el número de tickets que se ganarán, junto con el nuevo total. Se imprime un mensaje si una tarjeta tiene suficientes créditos para jugar.  
 
Categorías de premios 
Cada categoría de premios tiene un nombre, un número de tickets necesarios para conseguir ese premio y un recuento de los elementos de esta categoría que permanecen en un terminal. Los premios no saben a qué terminal pertenecen. 
 
Terminales 
Cada terminal contiene un lector de tarjetas magnéticas. Un terminal acepta dinero que se convierte en créditos en una tarjeta. El dinero se acepta como números enteros. Los créditos se otorgan con una proporción de 2 créditos por cada dólar. Los jugadores pueden utilizar un terminal para consultar los saldos de sus tarjetas. Incluya el número de la tarjeta en la impresión. Todos los créditos o tickets, o parte de ellos, se pueden transferir de una tarjeta a otra. Imprima siempre los saldos de una tarjeta cuando se acceda a los 
créditos o los tickets desde un terminal. Por último, los tickets se pueden canjear en los terminales por premios. Imprima un mensaje de error si una tarjeta no tiene suficientes tickets o si el terminal no dispone de un determinado tipo de premio. Imprima cuándo se concede un premio y el número restante de dicho tipo de premio en el terminal. Un terminal ofrece tres categorías de premios.  
 
Método main 
Instancie dos tarjetas y los objetos necesarios para probar el programa.  
•  Cargue créditos en cada tarjeta. 
•  Juegue a varios juegos utilizando las dos tarjetas. 
•  Transfiera el saldo de créditos y tickets de la tarjeta 1 a la tarjeta 2. 
•  Solicite los premios con la tarjeta 2. 
•  Intente jugar y solicitar un premio con la tarjeta 1. 
•  Realice las acciones necesarias para probar el programa. 

