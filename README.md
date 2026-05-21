# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para realizar la limpieza y depuración de colecciones de texto (List<String>). El objetivo principal del ejercicio es aprender a filtrar elementos de una lista según el tamaño de sus caracteres en tiempo de ejecución, utilizando la API Iterator para modificar la estructura de datos de forma segura y eficiente.

## Características
Filtrado Basado en Longitud: Utiliza el método .length() de la clase String para evaluar dinámicamente la cantidad de caracteres de cada palabra (it.next().length() < 4).

Mutación Segura de Estructuras: Implementa el patrón Iterator para evitar fallos de desincronización de índices y errores de concurrencia al eliminar datos durante un recorrido.

Inicialización Rápida de Listas: Emplea Arrays.asList() combinado con el constructor de ArrayList para instanciar y rellenar la colección de prueba de manera compacta en una sola línea.

Modificación In-Place: Los cambios se aplican directamente sobre la memoria de la lista original, optimizando el rendimiento del programa al no duplicar estructuras de datos en la RAM.
