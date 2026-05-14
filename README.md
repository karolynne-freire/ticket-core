# 🎟️ Ticket-Core: Sistema de Gestão de Eventos

O **Ticket-Core** é um sistema robusto e centralizado para a gestão de eventos em casas de shows e espaços multiuso. Desenvolvido como projeto prático para a disciplina de **Programação Orientada a Objetos (POO)**, o sistema foca em oferecer um motor de controle eficiente para o fluxo de locais, eventos e vendas de ingressos, garantindo a integridade dos dados e a automação de regras de negócio essenciais.

---

## 🚀 Funcionalidades Implementadas

O sistema atende aos seguintes requisitos funcionais:

* **RF01 – Cadastro de Local:** Gestão de espaços físicos com validação de unicidade (nome não duplicado).
* **RF02 – Cadastro de Evento:** Registro de eventos com obrigatoriedade de associação a um local existente.
* **RF03 – Venda de Ingressos:** Registro de ingressos com controle de tipo, assento e status de pagamento.
* **RF06 – Cálculo de Receita:** Método para somar o valor arrecadado considerando apenas ingressos com status de pagamento confirmado.
* **RF07 – Contagem de Público:** Relatório da quantidade de ingressos vendidos e pagos por evento.
* **RF08 – Verificação de Lotação:** Método lógico que compara o público atual com a capacidade máxima do local.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Conceitos aplicados:**

  * Encapsulamento
  * Coleções (`ArrayList`)
  * Construtores
  * Enums
  * Associações entre classes
* **IDE:** Eclipse ou VS Code

---

## ▶️ Como Executar o Projeto

### 📌 Pré-requisitos

Antes de começar, você precisa ter instalado:

* Java JDK 17 ou superior
* Uma IDE (Eclipse ou VS Code) **ou terminal**

---

### 💻 Rodando pela IDE

1. Clone o repositório:

```bash
git clone https://github.com/karolynne-freire/ticket-core.git
```

2. Abra o projeto na sua IDE

3. Execute a classe `Main`

---

### 🖥️ Rodando pelo terminal

1. Clone o projeto:

```bash
git clone https://github.com/karolynne-freire/ticket-core.git
```

2. Acesse a pasta:

```bash
cd ticket-core
```

3. Compile os arquivos:

```bash
javac -d bin src/**/*.java
```

4. Execute o programa:

```bash
java -cp bin Entidade.Main
```

---


## 💡 Futuras Melhorias

### 🔹 Lógica de Negócio

* Validação de conflito de agenda (mesmo local/data)
* Sistema de reembolso com atualização automática
* Filtros

### 🔹 Robustez

* Criação de exceções customizadas
* Validação de entradas (valores negativos, dados inválidos)

### 🔹 Arquitetura

* Implementação do padrão DAO
* Preparação para banco de dados (MySQL/PostgreSQL)
* Uso de interfaces para relatórios

---

## 📚 Contexto Acadêmico

Este projeto foi desenvolvido com fins educacionais para a disciplina de **Programação Orientada a Objetos (POO)**, com o objetivo de aplicar conceitos fundamentais de modelagem de sistemas e boas práticas de desenvolvimento em Java.

---






