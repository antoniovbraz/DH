*** Variables ***
${SITE}           https://www.digitalhouse.com/
${NAVEGADOR}      Chrome   
*** Keywords ***

Abrir o site da Digital House
  Open Browser      ${SITE}    Chrome
  Maximize Browser Window

Aceitar os Cookies
  Sleep  5
  Select frame   xpath=/html/body/iframe[2]
  Click Element  xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]

Clicar em "Ver outros cursos"
  Click Element   xpath=/html/body/div[1]/div/main/section/div/div[3]/div/a
