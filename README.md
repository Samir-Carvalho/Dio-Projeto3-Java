# Dio-Projeto3-Java
## Desafio
### Descrição do Desafio
Agora é a sua hora de brilhar! Crie uma solução que explore o conceito de Padrões de Projeto na pŕatica. Para isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero ;-)

Dica: Além dos projetos/repositórios que criamos para este desafio, caso queira explorar novos padrões de projeto digite no Google: “java design patterns github” ou “java design patterns examples”. Com isso, você conhecerá novos padrões e implementações de referência que podem ajudá-lo a dominar esse tema!

### Criei dois projetos em duas pastas procurando explorar conceitos de Strategy e Decorator. 
#### 1. Strategy -
Implementação para um sistema de geração de nota fiscal para uma locadora de veículos utilizando o padrão de projeto Strategy. Nesse sistema o usuário deve informar inicialmente o tipo de veículo para o qual se deseja emitir a nota fiscal. As opções de tipos de veículos são: veículo de passeio (carros), veículo de carga (caminhonetes) e veículo de passageiros (vans e ônibus)
Para diferenciar cada valor da locação gerei 3 tipos de veiculos:
1) Veículo de passeio: valor da diária de veículo de passeio * número de dias da locação.
2) Veículo de carga: valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine simples) e 1.5 * valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine dupla).
3) Veículo de passageiro: valor da diária de veículo de passageiros * número de dias da locação * (1 + capacidade do veículo/100).


#### 2. Decorator - 
Implementação utilizando o padrão de projeto Decorator para implementar o sistema de gerenciamento de uma lanchonete que vende sanduíches feitos a partir de pães franceses e pães de hambúrguer.
A ideia é que todo sanduíche tem um nome e seu preço varia de acordo com o pão utilizado e com os ingredientes escolhidos na sua confecção
Para diferenciar cada valor gerei diferentes tipos de custo. 
O pão francês custa R$ 1,50 e o pão de hambúrguer custa R$ 2,50. Além disso, os seguintes ingredientes podem ser utilizados na montagem de um sanduíche: hambúrguer (R$ 4,00/unidade), queijo (R$ 2,30/fatia), tomate (R$ 0,50/fatia) e cebola (R$ 1,30/porção).
