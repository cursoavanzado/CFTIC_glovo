# CFTIC_glovo
```
Applicacion web
```
# Pedidos de comida on-line

## Introducción

En este proyecto se trata de desarrollar una aplicación Web que permita a los usuarios
realizar pedidos de comida a través de la Web

Los pedidos son servidos por repartidos a domicilio que se encuentran distribuidos por
la localidad. Cada repartidor, lleva una aplicación móvil que informa en cada momento a la
central de su posición. Así mismo, el repartidor informa de su estado a la aplicación cada vez
que dicho estado cambia, este estado puede ser: "en reparto" o "disponible"

## Funcionalidad de la aplicación.

```
La aplicación cuenta con dos grandes bloques funcionales: cliente y administrador.
```
La funcionalidad del cliente cuenta con las siguientes opciones:
```
- Alta de clientes. Esta opción permite registrar nuevos clientes en la aplicación,
ya que solo los usuarios registrados podrán hacer uso de la misma. Para
registrar un cliente se requiere el nombre, usuario, contraseña, edad, tarjeta
de cargo (donde se le cargarán sus pedidos) y teléfono.
- Modificación de tarjeta de cargo. El usuario podrá entrar en cualquier
momento a la aplicación para modificar los datos de su tarjeta.
- Realización de pedido. Tras autenticarse el usuario en la aplicación, una de las
opciones será la de realizar pedido de comida. Al entrar en esa opción,
aparecerá las lista de alimentos para poderlos seleccionar y añadirlos a la
cesta. Se podrán eliminar elementos de la cesta y cancelar el pedido antes de
confirmarlo. Tras confirmar el pedido, éste quedará registrado y asignado al
repartidor que se encuentre más cerca del lugar desde el que el usuario ha
realizado el pedido. Si el usuario ha realizado con anterioridad otros pedidos
cuya cantidad acumulada sea igual o superior a 100 euros, se le aplicará un
descuento del 5%, informándole al usuario de este hecho al confirmar el
pedido.
- Seguimiento del pedido. El usuario podrá ver en un mapa o de alguna forma
que se os pueda ocurrir, la localización actual del repartidor con el pedido
solicitado.
- Histórico de pedidos. Se podrá ver la lista de pedidos realizados desde que el
usuario se registró como cliente. En el historíco aparecerá el número de
pedido y la fecha. Al pulsar sobre el número de pedido, se le mostrará el
detalle del mismo, es decir, los productos comprados y el precio total.
- Consulta de matrículas. Permitirá consultar las matriculas existentes, para
ello, se ofrecerán dos tipos de filtro:

 ```
En cuanto a la funcionalidad de administrador, se proporcionarán las siguientes
opciones:

```
- Clientes. Mostrará una lista con los clientes registrados. Para cada cliente, se
mostrará su nombre y total gastado en pedidos. La lista se mostrará ordenada
por gasto de mayor a menor
- Localización. Mostrará en un mapa, o de la manera que se estime oportuna, la
localización actual de los repartidores y el estado en el que se encuentran.

```
La aplicación debe exponer también unos servicios Web con las siguientes
funcionalidades:.

```
- Productos. Devuelve una lista con los datos de todos los productos registrados
- Alta repartidor. A partir de un JSON con los datos de un repartidor lo dará de
alta en el sistema
- Situación repartidor. A partir del código del repartidor nos devuelve su
localización
- Cambio situación repartidor. A partir del código del repartidor, y localización,
establece los nuevos datos en el mismo.
- Estado repartidor. A partir del código del repartidor y su estado, establece
dicho estado en el repartidor
```
## Tecnologías

```
- Para el desarrollo de la aplicación se aplicará el patrón MVC, empleando los
tecnologías Java EE y frameworks que considere oportuno.
- Los servicios Web serán implementados mediante REST
- En la capa cliente se emplearán tecnologías como HTML 5, JavaScript y JQuery.
No se utilizará el framework Angular

 ```
