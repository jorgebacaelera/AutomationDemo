# language: es
Característica: Comprar suscripción en dlocal mediante Cloudpay

  Como cliente
  Quiero comprar una suscripción mediante dlocal
  Para acceder al contenido de Toolbox

  # Escenarios de negocio
  @RealizarPago
  Esquema del escenario: Comprar suscripción con dlocal

    Dado que el comprador desea ingresar a la plataforma de Cloudpay

    Y selecciona la opción de comprar Suscripción

    Y ingresa en el formulario sus datos personales <nombre> <apellido>

    Y ingresa su correo electrónico <email>

    Y acepta los terminos y condiciones

    Entonces debería recibir un mensaje de confirmación al crear la cuenta


    Ejemplos:
       |  nombre       |apellido   | email     |
       |Jorge          |Baca       |jorginhoprueba@yopmail.com|

