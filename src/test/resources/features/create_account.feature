#language: es

@regression
Característica: Crear cuenta

  @TEST-1234
  Escenario: Crear cuenta
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario crea la cuenta
    Entonces se verifica que la cuenta se creo correctamente

  @TEST-1235
  Escenario: Crear cuenta Incorrecta
    Dado que el usuario ingresa a la home
    Y el usuario ingresa a registrar una cuenta
    Cuando el usuario crea la cuenta con campos en blanco
    Entonces se verifica que la cuenta no se creo


