# Patrones de Diseño en Java

## Descripción

Se trata de aplicar los principios de patrones de diseño en un proyecto donde se realiza una
encriptación sencilla de una frase.

## Patrones usados:

* Decorador

* Fábrica

* Plantilla

## ¿Cómo ejecutar los archivos?

El archivo que integra el código está en la carpeta "cliente" y se llama "DemoPatrones".

Al ejecutarlo solicita la ruta del archivo de texto a cifrar:

`Ingrese la ruta del archivo de texto para encriptar:`

El texto del archivo debe comenzar con alguna de las tres siguientes claves seguidas por un guión
(usar sólo minúsculas!):
* cesar - usa el cifrado césar
* invertido - invierte la cadena de texto
* vocales - cambia las vocales por números

Ejemplo: `invertido-el zorro salta la valla`

El aplicativo crea un archivo con el mensaje encriptado con la siguiente convención:
* nombre de la encriptación
* fecha
* hora

Ejemplo: `invertido-2022-04-18-19-00-13.txt`

Este nuevo archivo se guarda en la carpeta "data" en la raíz del proyecto.
Se pueden ver ejemplos de ejecución en la referida carpeta.

## Recursos
* Intellij
* Github
* Video de la clase de School of Automation
* Wikipedia: https://en.wikipedia.org/wiki/Software_design_pattern
