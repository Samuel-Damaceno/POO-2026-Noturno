# 🧩 Exercício 1: Sistema de Conta Bancária
### 🟢 Versão básica (Classes + Objetos)
Crie uma classe `ContaBancaria` com:
- Atributos:
    - `titular`
    - `saldo`
- Métodos:
    - `depositar(double valor)`
    - `sacar(double valor)`
    - `exibirSaldo()`

No `main`, crie uma conta, faça depósito e saque.

---
### 🟡 Expansão (Encapsulamento)
- Torne os atributos `private`
- Crie `getters` e `setters`
- Valide:
    - Não permitir saque maior que saldo
    - Não permitir depósito negativo

---
### 🟠 Expansão (Herança)
Crie subclasses:
- `ContaCorrente`
- `ContaPoupanca`

Diferenças:
- Conta corrente cobra taxa no saque
- Conta poupança rende juros

---
### 🔵 Expansão (Polimorfismo)
- Sobrescreva o método `sacar()` nas subclasses
- Crie um vetor/lista de `ContaBancaria` com diferentes tipos
- Percorra e execute métodos (cada um com comportamento diferente)

### 🟣 Expansão (Associação)
Crie uma classe `Cliente`:
- Um cliente pode ter várias contas
- Relacione `Cliente` com `ContaBancaria`

---

# 🎮 Exercício 2: Sistema de Personagens de Jogo
### 🟢 Versão básica (Classes + Objetos)
Crie uma classe `Personagem` com:
- Atributos:
    - `nome`
    - `vida`
    - `ataque`
- Métodos:
    - `atacar(Personagem inimigo)`
    - `receberDano(int dano)`

---
### 🟡 Expansão (Encapsulamento)
- Atributos `private`
- Validação:
    - Vida não pode ser negativa
    - Ataque deve ser positivo

---

### 🟠 Expansão (Herança)
Crie subclasses:
- `Guerreiro`
- `Mago`
- `Arqueiro`

Cada um com uma característica:
- Guerreiro → mais vida
- Mago → ataque especial
- Arqueiro → ataque à distância (pode atacar duas vezes, por exemplo)

---
### 🔵 Expansão (Polimorfismo)
- Sobrescreva o método `atacar()`
- Cada classe ataca de forma diferente

---

### 🟣 Expansão (Associação / Composição)
Crie:
- Classe `Arma`
- Classe `Inventario`

Relacionamentos:
- Personagem tem um inventário
- Personagem usa arma