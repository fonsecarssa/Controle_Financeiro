# - Sistema de Controle Financeiro (SCG Bank)

Um projeto em **Java** que simula um **sistema de controle financeiro pessoal**, permitindo adicionar receitas, registrar gastos e verificar o saldo atual.  
O sistema é composto por classes que representam transações financeiras e uma interface simples de interação via terminal.

---

## - Objetivo
O projeto foi desenvolvido com o propósito de **praticar conceitos de POO (Programação Orientada a Objetos)** em Java, como:
- Herança
- Encapsulamento
- Polimorfismo
- Organização modular de classes

---

## - Estrutura do Projeto

```
src/
├── ControleFinanceiro.java # Classe principal de controle de transações e saldo
├── Transacao.java # Classe base para todas as transações (receitas e gastos)
├── Receita.java # Representa entradas de dinheiro no sistema
├── Gastos.java # Representa saídas de dinheiro do sistema
├── Menu.java # Interface de interação com o usuário (via console)
└── SistemaControleFinanceiro.java # Ponto de entrada da aplicação
```

## - Funcionalidades

- Adicionar **receitas**  
- Adicionar **gastos**  
- Verificar **saldo atual**  
- Listar **transações realizadas**

*(algumas funcionalidades ainda estão em desenvolvimento ou aguardam revisão de integração)*

---

## - Classes Principais

### `ControleFinanceiro`
Gerencia o saldo atual e a lista de transações.  
Permite adicionar receitas e gastos, além de verificar se há saldo suficiente para uma operação.

### `Transacao`
Classe base abstrata para representar uma transação genérica.  
Contém atributos comuns:
- `valor`
- `descricao`
- `data`

### `Receita` e `Gastos`
Herdam de `Transacao`:
- `Receita` adiciona dinheiro ao saldo.  
- `Gastos` subtrai dinheiro do saldo, com verificação de disponibilidade.

### `Menu`
Interface de linha de comando (CLI) que apresenta opções ao usuário e captura suas escolhas.

### `SistemaControleFinanceiro`
Classe com o método `main()` que inicializa o sistema, o menu e o controle financeiro.

---

## - Como Executar o Projeto

## - Instalação e Execução Passo a Passo

###  1. Clonar o repositório
```bash
git clone https://github.com/seuusuario/controle-financeiro.git
cd controle-financeiro/src
```

### 2. Clonar o repositório
```bash
javac *.java
```

### 3. Executar o programa principal
```bash
java SistemaControleFinanceiro
```

## - Melhorias Futuras

- [ ] Implementar interação completa entre `Menu` e `ControleFinanceiro`
- [ ] Corrigir captura de descrições no `Menu` (`scanner.nextLine()` em vez de `toString()`)
- [ ] Exibir histórico detalhado de transações
- [ ] Adicionar persistência de dados (salvar em arquivo)


---

## - Autor

Desenvolvido por **fonsecarssa**  
- Projeto em desenvolvimento — *commit inicial WIP (estrutura base)*

---

## - Licença

Este projeto é de **uso livre para fins educacionais**.  


