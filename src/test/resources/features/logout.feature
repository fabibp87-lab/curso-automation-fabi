#language: es

@regression
Característica: Salir de la Cuenta

  @TEST-1236
  Escenario: Cierre de Sesion
    Dado que el usuario ingresa a la home
    Y el usuario ingresa al login
    Y el usuario se loguea con datos válidos
    Cuando el usuario Cierra Sesion
    Entonces se verifica que muestra un mensaje

