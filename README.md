# SendMessageViewBinding

### Objetivo del proyecto
Esta aplicación se ha creado con el objetivo de escribir un mensaje y enviarlo desde la activity principal, donde se encuentra un botón que al pulsarlo nos lleva a la activity donde se mostrará el mensaje que hemos escrito previamente. También se ha incluido un menú desplegable con un apartado 'Sobre mi' donde se muestra información de la autora, enlace a GitHub y la versión de la aplicación. 

### Conocimientos aprendidos

##### Intent y Bundle
Aprendizaje sobre el uso de la clase Intent, que se utiliza para enviar objetos e información, tanto de forma implícita como de forma explícita. Tambien hemos aprendido sobre el uso de la clase Bundle, que se utiliza para almacenar datos e información entre las diferentes activity. 

##### Ciclo de vida
Aprendizaje sobre el ciclo de vida de una activity, viendo los diferentes estados por los que pasa la acivity. 

##### Botón
Implementación de un botón haciendo uso de FAB (Float Action Button). Dicho botón se ha creado mediante una expresión lambda que hace uso del método setOnClickListener.

##### Lenguaje
Incorporar un nuevo idioma a nuestra aplicación, con la opción de poder verse tanto en español como en inglés.

##### Orientación horizontal
Adaptación de nuestra interfaz en formato horizontal, para tener la opción tanto en vertical como en horizontal.

##### Temas
Modificación de los temas de nuestra interfaz, así como el color en modo light y en modo dark, el tipo de letra y el tamaño, que va editado en un xml llamado dimens.

##### Menú
Creación de un menú de opciones siguiendo la [guía](http://https://developer.android.com/guide/topics/ui/menus?hl=es-419#options-menu "guía") de Android Developers. 
Dentro de este menú, hemos diseñado un apartado 'Sobre mi', el cual nos dirige a una activity en la que hemos implementado una [libreria](http://https://github.com/daniel-stoneuk/material-about-library "libreria") que nos a ayudado a la creación de tarjetas. 

### Capuras de pantalla de mi aplicación

| SendMessageActivity [light] | ViewActivity [light] | AboutActivity [light] |
| :---------------:| :---------------:| :---------------:|
| <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/1.jpg"> | <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/2.jpg"> | <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/3.jpg"> |
| SendMessageActivity [dark] | ViewActivity [dark] | AboutActivity [dark] |
| <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/4.jpg"> | <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/5.jpg"> | <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/6.jpg"> |

| SendMessageActivity [en-land] |
| :---------------:|
| <img src="https://github.com/jessicasrui/SendMessageViewBinding/blob/main/imagenes/7.png"> |