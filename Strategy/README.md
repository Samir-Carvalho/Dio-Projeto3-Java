# Dio-Projeto3-Java
## Desafio

#### 1. Strategy -
Implementação para um sistema de geração de nota fiscal para uma locadora de veículos utilizando o padrão de projeto Strategy. Nesse sistema o usuário deve informar inicialmente o tipo de veículo para o qual se deseja emitir a nota fiscal. As opções de tipos de veículos são: veículo de passeio (carros), veículo de carga (caminhonetes) e veículo de passageiros (vans e ônibus)
Para diferenciar cada valor da locação gerei 3 tipos de veiculos:
1) Veículo de passeio: valor da diária de veículo de passeio * número de dias da locação.
2) Veículo de carga: valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine simples) e 1.5 * valor da diária de veículo de carga * número de dias da locação (para caminhonetes de cabine dupla).
3) Veículo de passageiro: valor da diária de veículo de passageiros * número de dias da locação * (1 + capacidade do veículo/100).


