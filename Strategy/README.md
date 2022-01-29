# Dio-Projeto3-Java
## Desafio

#### 1. Strategy -
Implementação para um sistema de geração de nota fiscal para uma locadora de veículos utilizando o padrão de projeto Strategy. Nesse sistema o usuário deve informar inicialmente o tipo de veículo para o qual se deseja emitir a nota fiscal. As opções de tipos de veículos são: veículo de passeio (carros), veículo de carga (caminhonetes) e veículo de passageiros (vans e ônibus)
Para diferenciar cada valor da locação gerei 3 tipos de veiculos:
1) Veículo de passeio: valor da diária de veículo de passeio * número de dias da locação.
2) Veículo de carga: valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine simples) e 1.5 * valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine dupla).
3) Veículo de passageiro: valor da diária de veículo de passageiros * número de dias da locação * (1 + capacidade do veículo/100).

Para veículo de passeio deverá informar o valor da diária de veículo de passeio e quantidade de dias da locação. 
Para veículo de carga deverá informar o valor da diária de veículo de carga, a quantidade de dias da locação e se o veículo é de cabine simples ou de cabine dupla. 
Para veículo de passageiros, o usuário deverá informar o valor da diária de veículo de passageiros, a quantidade de dias da locação e a capacidade do veículo

Exemplo de como ficou uma saida:

#### LOCADORA DE VEICULOS ####
1 - Gerar nota para veículo de passeio
2 - Gerar nota para veículo de carga
3 - Gerar nota para veículo de passageiros
4 - Sair
Escolha uma opcao: 3
Entre com a capacidade do veículo: 12
Entre com o valor da diaria: 70,00
Entre com a quantidade de dias: 3
===================== Nota Fiscal =============================
= Valor a ser pago: R$ 235,20 =
===============================================================
