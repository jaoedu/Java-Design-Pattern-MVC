# Java-Design-Pattern-MVC
Fiz uma implementação básica de um sistema que controla as saídas de uma conta bancárica. Implementei no design pattern MVC. 
MVC é um padrão de design que ajuda a separar preocupações em um aplicativo, tornando-o mais modular e fácil de manter. 

O papel de cada classe:

O Modelo (Model) representa a lógica de negócios e os dados do aplicativo.
A Visualização (View) lida com a apresentação de informações para o usuário.
O Controlador (Controller) age como um intermediário entre o modelo e a visualização, controlando o fluxo de dados e interação com o usuário.

Interação entre Model, View e Controller:

A interação entre essas três partes ocorre da seguinte forma:
O controlador recebe entradas do usuário por meio da visualização.
O controlador chama métodos no modelo para processar essas entradas.
O modelo atualiza seus dados.
O controlador atualiza a visualização para refletir as alterações no modelo.
A visualização exibe informações para o usuário.
