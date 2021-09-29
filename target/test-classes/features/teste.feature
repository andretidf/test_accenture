#language: pt
#enconding: UTF-8

Funcionalidade: Acessar Sistema

Contexto: Acessar o sistema

Cenario: Preencher o formulario com dados validos
Dado que eu preenchi make com "Audi"
E com Model "Three-Wheeler"
E com Cylinder entre"200"
E com Engine com "200"
E data com "09/08/2021"
E number com "2"
E marcar RightHand com yes
E NumberOfSeats com "1"
E Fuel Type com "Petrol"
E Payload com "2"
E Total Weiht com "120"
E List Price com "501"
E Annual Mileage com "1000"
Quando clicar em Next deve ir para a aba Insurant Data 



Dado que eu preencha todos os dados do formulario  "Andre" "Muniz" "10/01/1986" "Brazil" "71916750" "Farmer"
E escolher o Hobbie BungeeJumping
Quando clicar em Next deve ir para a aba Product Data

Dado que eu preencha todos os dados do formulario "11/11/2021" " 3.000.000,00" "Malus 10" "Partial Coverage" "Yes"
E selecionar em Optional Products Euro Protection
Quando clicar em Next deve ir para a aba Select Price Option


Dado que eu seleciono a opcao silver
E clico em Next
Quando o sistema deve abrir a aba Send Quote

Dado que eu preencha todos os dados do formulario "andre@teste.com" "andreti" "Setembro2021" "Setembro2021"
Quando clicar em Send
Entao o sistema deve abrir um modal informando o sucesso do envio do email