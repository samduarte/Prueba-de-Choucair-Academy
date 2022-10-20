#Author: sam duarte
@stories
Feature: academy Choucair
  As a user, I what to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: create a new user to enter the Utest page
    Given create a new user for the page Utest
    When the user enters the required data in the form
    | strName  | strLastName  | strEmail                   | strMesCumpleanos   | strDiaCumpleanos   | strAnoCumpleanos   | strLenguajesHablado | strCiudad   | strPostal | strPais   | strCompu  | strVersion | strIdioma  | strMovil | strModelo | strSistema  | strContrase     | strConFIR       |
    | Sam      | Duarte       | samduarte1997@gmail.com    | April              | 23                 | 1997               | Spanish             | Cartagena   | 130011    | Colombia  | Linux     | Kubuntu    | Spanish    | Apple    | iPhone XR | iOS 2.2     | Samduarte1997*  | Samduarte1997*  |
    Then ends with user registration