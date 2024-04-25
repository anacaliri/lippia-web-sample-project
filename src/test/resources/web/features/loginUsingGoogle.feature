@login
Feature: Login using Google


    #COMO usuario registrado
    # NECESITO ingresar credenciales
    # PARA ingresar a la app

  #Criterios de aceptación
  #Ingresar email es obligatorio para iniciar sesión manualmente
  #Ingresar contraseña es obligatorio para iniciar sesión manualmente
  #La contraseña debe mostrarse ofuscada por defecto
  #La contraseña debe poder hacerse visible
  #Existe una opción para recuperar la contraseña

  @smoke
  Scenario Outline: Successful login using Google
    Given user is in <landing_url>
    And user is registered with user <user> and <password>
    When user clicks the <button> button
    Then <login_url> page is displayed
    Examples:
      | landing_url          |user | password | button | login_url                        |
      | https://clockify.me/ |     |          | Log in | https://app.clockify.me/en/login |

#    #https://clockify.me/
#    When The user logs in the application with: <email>, <password>
#  @login_manual @smoke
#  Scenario Outline: Login manual fallido
#    Given estoy registrado
#    And me encuentro en <login_url>
#    When ingreso email <email>
#    And ingreso contraseña <password>
#    Then veo el mensaje <message>
#    Examples:
#      | login_url                        | email                           | password        | message                   |
#      | https://app.clockify.me/en/login | anabelcaliri@crowdaronline.com  | YPxNR6wtBCE9ifr | Invalid email or password |
#      | https://app.clockify.me/en/login | anabel.caliri@crowdaronline.com | YPxNR6wtBCE9i88 | Invalid email or password |
#
#  @smoke
#  Scenario Outline: Al ingresar la contraseña se muestra ofuscada
#    Given estoy registrado
#    And me encuentro en <login_url>
#    When ingreso contraseña <password>
#    Then no es posible leer la contraseña
#    Examples:
#      | login_url                        | password        |
#      | https://app.clockify.me/en/login | YPxNR6wtBCE9ifr |
#
#  Scenario Outline: Desofuscar contraseña exitosamente
#    Given estoy registrado
#    And me encuentro en <login_url>
#    And ingresé contraseña <password>
#    When presiono botón <button>
#    Then es posible leer la contraseña
#    Examples:
#      | login_url                        | password        | button |
#      | https://app.clockify.me/en/login | YPxNR6wtBCE9ifr | ojo    |
#
#  Scenario Outline: Acceder a recuperar contraseña
#    Given estoy registrado
#    And me encuentro en <login_url>
#    When presiono botón <button>
#    Then me encuentro en <reset_password_url>
#    Examples:
#      | login_url                        | button           | reset_password_url                        |
#      | https://app.clockify.me/en/login | Forgot password? | https://app.clockify.me/reset-password?t= |