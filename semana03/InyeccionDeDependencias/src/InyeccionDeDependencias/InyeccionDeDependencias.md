

# Inyeccion de Dependencias


Este proyecto contiene dos inyecciones cuando se revisa una orden. 
Para esto se hacen 2 interfaces: **PagoServicios** y **ServicioEmail**.
Por el momento el pago de servicios solo avisa si se está trabajando el pago, sin embargo porías tener
diferentes estados. Por otra parte, el email puede representar diferentes estados
y aquí añadimos lo más comun como es correcto o completo, error y en proceso.

## Clases Email

Las clases Email heredan de la interfaz y dentro de ellas se genera un mensaje
que solo toma de la Orden a la persona que está en la 'orden', y genera un mensaje distinto.
Este mensaje da la idea de lo que puede ocurrir dependiendo el estado de la orden.

## Construcción de un Orden
Para construir una orden puede enviarse directamente cada elemento,

```java
Orden o01 = new Orden("noOrden", "Nombre","contacto@example.com", new Pago(), new EmailCorrecto());
```

O bien, puede enviarse por medio de una inyección de email con la que se revisa el estado 
del último argumento como ```char``` siendo posibles ```'C'``` o ```'E'``` y en cualquier otro caso 
se pasaría al estado de 'Procesando'

```java
Orden o02 = Inyector.inyectarEmail("826661", "Miroslava Tlapale",
                "cliente02@example.com",'E');
```

## Principal

Dentro del programa principal solo se declaran 3 ordenes de ambas maneras mencionadas y,
posteriormente, se llama al método en orden donde se hace el llamado a los métodos de tanto el pago 
como de cualquier Email.

```java
o00.processOrder();
o01.processOrder();
o02.processOrder();
```

## Resultado
Como resultado se obtendrá una 'Orden' como la siguiente imagen
```
#982323
A nombre de: Ariel Doritos

Procesando la orden...

Procesando el pago ...

Enviando correo a: cliente00@example.com
Asunto: Estado del Pedido
Su pedido se encuentra en proceso de envío

+-------------------------------------------------------------+

#567222
A nombre de: David Montecinos

Procesando la orden...

Procesando el pago ...

Enviando correo a: cliente01@example.com
Asunto: Estado del Pedido
Su pedido ha sido enviado correctamente

+-------------------------------------------------------------+

#826661
A nombre de: Miroslava Tlapale

Procesando la orden...

Procesando el pago ...

Enviando correo a: cliente02@example.com
Asunto: Estado del Pedido
Su pedido se ha perdido, favor de comunicarse al correo
olakase@example.com

```