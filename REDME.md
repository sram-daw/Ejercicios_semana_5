## Ejercicios semana 5 programación
* [Ejercicio 1](src/semana5/Ejercicio1.java)
* [Ejercicio 2](src/semana5/Ejercicio2.java)
* [Ejercicio 3](src/semana5/Ejercicio3.java)
* [Ejercicio 4](src/semana5/Ejercicio4.java)
* [Ejercicio 5](src/semana5/Ejercicio5.java)
* [Ejercicio 6](src/semana5/Ejercicio6.java)

Diagrama Ejercicio 6

```mermaid
graph TD
  froml1c1tol28c9{"if operacion.equals('suma')"}
  froml2c12tol2c63("System.out.print('Introduzca el primer sumando: ');")
  froml3c12tol3c44("valor1 = inputFloat.nextFloat();")
  froml4c12tol4c64("System.out.print('Introduzca el segundo sumando: ');")
  froml5c12tol5c44("valor2 = inputFloat.nextFloat();")
  froml7c12tol7c75("System.out.println('El resultado es ' + sumar(valor1, valor2));")
  froml8c15tol28c9{"if operacion.equals('resta')"}
  froml9c12tol9c57("System.out.print('Introduzca el minuendo: ');")
  froml10c12tol10c44("valor1 = inputFloat.nextFloat();")
  froml11c12tol11c59("System.out.print('Introduzca el sustraendo: ');")
  froml12c12tol12c44("valor2 = inputFloat.nextFloat();")
  froml13c12tol13c76("System.out.println('El resultado es ' + restar(valor1, valor2));")
  froml14c15tol28c9{"if operacion.equals('multiplicacion') | operacion.equals('multiplicación')"}
  froml15c12tol15c62("System.out.print('Introduzca el primer factor: ');")
  froml16c12tol16c44("valor1 = inputFloat.nextFloat();")
  froml17c12tol17c63("System.out.print('Introduzca el segundo factor: ');")
  froml18c12tol18c44("valor2 = inputFloat.nextFloat();")
  froml19c12tol19c81("System.out.println('El resultado es ' + multiplicar(valor1, valor2));")
  froml20c14tol28c9{"if operacion.equals('division') | operacion.equals('división')"}
  froml21c12tol21c58("System.out.print('Introduzca el dividendo: ');")
  froml22c12tol22c44("valor1 = inputFloat.nextFloat();")
  froml23c12tol23c56("System.out.print('Introduzca el divisor: ');")
  froml24c12tol24c44("valor2 = inputFloat.nextFloat();")
  froml25c12tol25c77("System.out.println('El resultado es ' + dividir(valor1, valor2));")
  froml27c12tol27c80("System.out.println('Por favor, introduzca una operación adecuada.');")
  froml1c1tol28c9 -- true --> froml2c12tol2c63
  froml1c1tol28c9 -- false --> froml8c15tol28c9
  froml2c12tol2c63 --> froml3c12tol3c44
  froml3c12tol3c44 --> froml4c12tol4c64
  froml4c12tol4c64 --> froml5c12tol5c44
  froml5c12tol5c44 --> froml7c12tol7c75
  froml8c15tol28c9 -- true --> froml9c12tol9c57
  froml8c15tol28c9 -- false --> froml14c15tol28c9
  froml9c12tol9c57 --> froml10c12tol10c44
  froml10c12tol10c44 --> froml11c12tol11c59
  froml11c12tol11c59 --> froml12c12tol12c44
  froml12c12tol12c44 --> froml13c12tol13c76
  froml14c15tol28c9 -- true --> froml15c12tol15c62
  froml14c15tol28c9 -- false --> froml20c14tol28c9
  froml15c12tol15c62 --> froml16c12tol16c44
  froml16c12tol16c44 --> froml17c12tol17c63
  froml17c12tol17c63 --> froml18c12tol18c44
  froml18c12tol18c44 --> froml19c12tol19c81
  froml20c14tol28c9 -- true --> froml21c12tol21c58
  froml20c14tol28c9 -- false --> froml27c12tol27c80
  froml21c12tol21c58 --> froml22c12tol22c44
  froml22c12tol22c44 --> froml23c12tol23c56
  froml23c12tol23c56 --> froml24c12tol24c44
  froml24c12tol24c44 --> froml25c12tol25c77
```