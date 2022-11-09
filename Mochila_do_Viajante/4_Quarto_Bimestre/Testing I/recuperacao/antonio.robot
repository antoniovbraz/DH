*** Settings ***

Library   SeleniumLibrary
Resource  ./antonio.resource

*** Test Case ***
Validação das informações do curso Certified Tech Developer
  Abrir o site da Digital House
  Aceitar os Cookies
  Clicar em "Ver outros cursos"
