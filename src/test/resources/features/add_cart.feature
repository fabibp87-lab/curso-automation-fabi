#language: es

@regression
Característica: Realizar una Compra

  @TEST-1237
  Escenario: Agregar al Carrito
    Dado que el usuario ingresa a la home
    Y el usuario ingresa al login
    Y el usuario se loguea con datos válidos
    Cuando el usuario selecciona un producto
    Y el usuario ingresa al producto
    Y el usuario carga el producto
    Entonces se verifica que el producto se cargo