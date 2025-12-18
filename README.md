
# Estacionamento (Padrão Strategy)

Aplicação do padrão de projeto **Strategy** para cálculo de tarifas de estacionamento.

## Problema

Um estacionamento precisa calcular o valor a ser cobrado utilizando **diferentes critérios**:

- **Veículos de passeio**: R$ 2,00 por hora.  
  - Se o tempo for maior que **12 horas**, cobra-se **diária**.  
  - Se o número de **dias** for maior que **15**, cobra-se **mensalidade**.
- **Caminhões**: regras dependem do **número de eixos** e do **valor da carga**.
- **Veículos de passageiros** (vans/ônibus): custo pode depender da **cap- **Veículos de passageiros** (vans/ônibus): custo pode depender da **capacidade** e do **tempo**.

Requisitos:
- Permitir que **diferentes algoritmos de cálculo** sejam utilizados pela classe.
- O algoritmo possa ser **usado em diferentes empresas** sem copiar código.
- A classe possa **iniciar com um algoritmo** e permitir **troca posterior**.
- **Sem duplicação** e com **crescimento controlado** da base de código.

## Solução

Uso do padrão **Strategy**:
- Interface `Calcular` define o contrato para cálculo.
- Implementações concretas (ex.: `CalcularVeiculoHora`, `VeiculoCargaHora`) encapsulam a regra específica.
- A classe `Ticket` consome a estratégia e calcula o valor ao **fechar** o ticket.

