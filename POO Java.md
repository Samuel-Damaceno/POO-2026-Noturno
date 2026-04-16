# 🎯 Conceitos Básicos
## 🧩 O que é uma classe?
Uma **classe** é como um **molde (ou blueprint)** para criar objetos.

Ela define:
- **o que um objeto tem** → atributos (dados)
- **o que um objeto faz** → métodos (comportamentos)

👉 Pense assim:  
> Uma classe é como a planta de uma casa — ela descreve tudo, mas não é a casa em si.

---
## 🧱 O que uma classe representa?
Uma classe representa um **conceito do mundo real ou lógico** dentro do sistema.

Exemplos:
- `Aluno` → representa um estudante
- `Carro` → representa um veículo
- `ContaBancaria` → representa uma conta em banco

Cada objeto criado a partir da classe será uma **instância** com valores próprios.

---
## 🏗️ Estrutura de uma classe em Java

Uma classe é formada basicamente por:

```Java
public class Aluno {  
  
    // Atributos (características)  
    String nome;  
    int idade;  
    double media;  
  
    // Método (comportamento)  
    void exibirDados() {  
        System.out.println("Nome: " + nome);  
        System.out.println("Idade: " + idade);  
        System.out.println("Média: " + media);  
    }  
}
```

---
## 🔑 Componentes principais

### 1. Atributos (ou propriedades)
São as **variáveis da classe**, que armazenam dados.

Exemplo:
	`String nome;`
	`int idade;`

✔ Representam o **estado** do objeto.

---
### 2. Métodos
São as **ações que o objeto pode realizar**.

Exemplo:
```Java
void estudar() {  
    System.out.println("O aluno está estudando");  
}
```

✔ Representam o **comportamento**.

---
### 3. Construtor (importante)
É um método especial usado para **criar objetos**.
```Java
public Aluno(String nome, int idade) {  
    this.nome = nome;  
    this.idade = idade;  
}
```

✔ Serve para inicializar os atributos.

---
## 🔗 Como as classes se relacionam?
Classes não existem isoladas — elas se conectam entre si. Os principais tipos de relacionamento são:

### 1. Associação (uso simples)
Uma classe usa outra.
```Java
class Professor {  
    String nome;  
} 
```

```Java
class Curso {  
    Professor professor;  
}
```
👉 Um curso **tem um professor**.

---
### 2. Agregação
Relacionamento "tem um", mas com independência.

Exemplo:
- Um `Departamento` tem `Professores`, mas eles existem mesmo sem o departamento.

---
### 3. Composição
Relacionamento forte (dependência total).

Exemplo:
- Um `Carro` tem um `Motor`
- Se o carro deixar de existir, o motor também (no contexto do sistema)

---
### 4. Herança (muito importante)
Uma classe herda características de outra.
```Java
class Pessoa {  
    String nome;  
}
```

```Java
class Aluno extends Pessoa {  
    int RA;  
}
```

👉 `Aluno` herda de `Pessoa`

---

## ⚙️ Modificadores de acesso (encapsulamento)
Controlam quem pode acessar atributos e métodos:

- `public` → acesso livre
- `private` → acesso apenas dentro da classe
- `protected` → acesso na herança
- (default) → acesso no mesmo pacote

Exemplo:

```Java
private String nome;
```

✔ Isso protege os dados (princípio do **encapsulamento**)

---

## 🔒 Getters e Setters
Como atributos geralmente são `private`, usamos métodos para acessar/modificar:
```Java
public String getNome() {  
    return nome;  
}  
``` 

```Java
public void setNome(String nome) {  
    this.nome = nome;  
}
```
---

## 🧠 Resumão
- Classe = molde
- Objeto = instância da classe
- Atributos = dados
- Métodos = ações
- Construtor = cria o objeto
- Relacionamentos = conexão entre classes
- Encapsulamento = proteção dos dados

---
# 📦 Objetos e Instanciação em Java
## 🧩 O que é um objeto?
Um **objeto** é uma **instância de uma classe**.

👉 Se a classe é o molde, o objeto é o que você cria a partir dele.

Exemplo:
- Classe: `Aluno`
- Objeto: um aluno específico, como _João, 20 anos_

---
## 🧠 Pensando na prática
Classe:
```Java
class Aluno {  
    String nome;  
    int idade;  
}
```

Objeto:
```Java
Aluno a1 = new Aluno();
```

👉 Aqui você criou um objeto chamado `a1`

---
## ⚙️ O que é instanciação?
**Instanciar** é o ato de **criar um objeto a partir de uma classe**.

Isso acontece usando a palavra-chave: `new`

---

## 🏗️ Estrutura da instanciação
```Java
Aluno a1 = new Aluno();
```

Vamos quebrar isso:
- `Aluno` → tipo (classe)
- `a1` → variável de referência
- `new Aluno()` → cria o objeto na memória

---
## 📍 Memória (conceito importante)

Quando você faz:
```Java
Aluno a1 = new Aluno();
```

Acontece o seguinte:
- `a1` guarda o **endereço do objeto**
- O objeto é criado na **heap (memória dinâmica)**

👉 Ou seja:  
Você não guarda o objeto diretamente, mas sim uma **referência** para ele.

---
## ✏️ Acessando atributos do objeto
```Java
a1.nome = "Samuel";  
a1.idade = 20;
```

✔ Cada objeto tem seus próprios valores

---
## 📊 Criando vários objetos
```Java
Aluno a1 = new Aluno();  
Aluno a2 = new Aluno();  
  
a1.nome = "Ana";  
a2.nome = "Carlos";
```

👉 Mesmo sendo da mesma classe, cada objeto é independente.

---
## 🔨 Instanciação com construtor
Forma mais correta e usada:
```Java
class Aluno {  
    String nome;  
    int idade;  
  
    public Aluno(String nome, int idade) {  
        this.nome = nome;  
        this.idade = idade;  
    }  
}
```

Agora criando o objeto:
```Java
Aluno a1 = new Aluno("Samuel", 20);
```

✔ Já cria o objeto com valores definidos

---

## 🔁 Referência vs Objeto (pegadinha de prova)
```Java
Aluno a1 = new Aluno();  
Aluno a2 = a1;
```

👉 Agora:
- `a1` e `a2` apontam para o **mesmo objeto**

Se fizer:
```Java
a2.nome = "João";
```

➡ `a1.nome` também muda!

---
## ❌ Objeto nulo
```Java
Aluno a1 = null;
```

👉 Aqui NÃO existe objeto ainda

Se tentar:
```Java
a1.nome = "Teste";
```

💥 Erro: `NullPointerException`

---
## 🧠 Ciclo de vida do objeto
1. Criação → `new`
2. Uso → acessar atributos/métodos
3. Destruição → feita automaticamente pelo **Garbage Collector**

---
## 🧠 Resumão
- Objeto = instância de uma classe
- Instanciar = criar objeto com `new`
- Variável guarda **referência**, não o objeto
- Objetos são independentes (exceto quando compartilham referência)
- Construtor facilita a criação
- `null` = ausência de objeto

---
# 🔒 Encapsulamento em Java
## 🧩 O que é encapsulamento?
Encapsulamento é o princípio de:

👉 **esconder os dados internos de uma classe e controlar o acesso a eles**

Ou seja:
- Você **protege os atributos**
- E só permite acesso de forma **controlada**

---
## 🎯 Por que isso é importante?
Sem encapsulamento:
- qualquer parte do sistema pode alterar valores
- isso pode gerar **erros difíceis de encontrar**

Com encapsulamento:
- você **controla o que pode ou não pode acontecer**
- garante **consistência dos dados**

---
## 🧱 Como aplicar encapsulamento em Java?
Existem 2 passos principais:

### 1. Tornar os atributos `private`
```Java
class Aluno {  
    private String nome;  
    private int idade;  
}
```

👉 Agora ninguém fora da classe pode acessar diretamente

---
### 2. Criar métodos Getters e Setters
#### Getter (pegar valor)
```Java
public String getNome() {  
    return nome;  
}
```

#### Setter (alterar valor)
```Java
public void setNome(String nome) {  
    this.nome = nome;  
}
```

---

## 🧠 Exemplo completo
```Java
class Aluno {  
    private String nome;  
    private int idade;  
  
    public String getNome() {  
        return nome;  
    }  
  
    public void setNome(String nome) {  
        this.nome = nome;  
    }  
  
    public int getIdade() {  
        return idade;  
    }  
  
    public void setIdade(int idade) {  
        if (idade > 0) {  
            this.idade = idade;  
        }  
    }  
}
```

---

## ⚠️ O diferencial do encapsulamento
Perceba isso:
```Java
public void setIdade(int idade) {  
    if (idade > 0) {  
        this.idade = idade;  
    }  
}
```

👉 Aqui você **valida o dado antes de salvar**

Sem encapsulamento, alguém poderia fazer:
```Java
aluno.idade = -10; // inválido!
```

Com encapsulamento:  
✔ você impede isso

---

## 🔐 Modificadores de acesso
Eles são a base do encapsulamento:

|Modificador|Acesso|
|---|---|
|`private`|só dentro da classe|
|`public`|qualquer lugar|
|`protected`|herança + pacote|
|default|apenas no pacote|

👉 Regra prática:
- Atributos → `private`
- Métodos → geralmente `public`

---
## 🧠 Encapsulamento na prática (uso)
```Java
Aluno a1 = new Aluno();  
  
a1.setNome("Samuel");  
a1.setIdade(20);  
  
System.out.println(a1.getNome());
```

👉 Você nunca acessa direto o atributo

---
## 🚫 Erro comum de iniciante

Fazer isso:
```Java
public String nome;
```

👉 Isso quebra totalmente o encapsulamento

---
## 💡 Dica importante (nível faculdade)
Encapsulamento não é só "usar getter e setter".

Ele também serve para:
- esconder lógica interna
- reduzir dependência entre classes
- facilitar manutenção do código

---
## 🧠 Resumão
- Encapsulamento = proteger dados
- Usa `private` nos atributos
- Usa `get` e `set` para acesso controlado
- Permite validação de dados
- Evita erros e inconsistências

---
# 🧬 Herança em Java
## 🧩 O que é herança?
Herança é quando uma classe **herda atributos e métodos de outra**.

👉 A ideia é **reutilizar código**.

---
## 🧠 Conceito
- Classe pai (superclasse)
- Classe filha (subclasse)

Exemplo:
```Java
class Pessoa {  
    String nome;  
    int idade;  
}
```
```Java
class Aluno extends Pessoa {  
    int RA;  
}
```

👉 `Aluno` herda tudo de `Pessoa`

---

## ✅ O que é herdado?
A subclasse herda:
- atributos
- métodos

Mas **não herda diretamente construtores**

---
## 🔍 Exemplo prático
```Java
class Pessoa {  
    String nome;  
  
    void falar() {  
        System.out.println("Olá!");  
    }  
}  
```
 
```Java 
class Aluno extends Pessoa {  
    void estudar() {  
        System.out.println("Estudando...");  
    }  
}
```

Uso:
```Java
Aluno a = new Aluno();  
  
a.nome = "Samuel"; // herdado  
a.falar();         // herdado  
a.estudar();       // próprio
```

---
## ⚠️ Palavra-chave `super`
Usada para acessar elementos da superclasse:
```Java
class Pessoa {  
    String nome;  
  
    public Pessoa(String nome) {  
        this.nome = nome;  
    }  
} 
```
 
```Java 
class Aluno extends Pessoa {  
    int RA;  
  
    public Aluno(String nome, int RA) {  
        super(nome); // chama o construtor da classe pai  
        this.RA = RA;  
    }  
}
```

---
## 🚫 Limitação importante
Java **não suporta herança múltipla de classes**  
(uma classe não pode herdar de várias ao mesmo tempo)

---

# 🎭 Polimorfismo em Java
## 🧩 O que é polimorfismo?
Polimorfismo significa:

👉 **um mesmo método pode ter comportamentos diferentes**

---
## 🧠 Tipos principais
### 1. Sobrescrita (Override) — mais importante
Quando a subclasse **redefine um método da superclasse**

---
## 🔁 Exemplo de Override
```Java
class Pessoa {  
    void falar() {  
        System.out.println("Pessoa falando");  
    }  
}  ```
  
class Aluno extends Pessoa {  
    @Override  
    void falar() {  
        System.out.println("Aluno falando");  
    }  
}
```

Uso:
```Java
Aluno a = new Aluno();  
a.falar();
```

✔ Vai executar o método da classe `Aluno`

---

## ⚠️ `@Override` (boa prática)
Não é obrigatório, mas:
- evita erros
- deixa o código mais claro

---

## 🎯 Polimorfismo com referência da superclasse
Aqui está o ponto mais importante:
```Java
Pessoa p = new Aluno();  
p.falar();
```

👉 Mesmo sendo `Pessoa`, ele executa o método de `Aluno`

✔ Isso é **polimorfismo em tempo de execução**

---
## 🧠 Outro exemplo (nível prova)
```Java
class Animal {  
    void fazerSom() {  
        System.out.println("Som genérico");  
    }  
}
```
```Java
class Cachorro extends Animal {  
    @Override  
    void fazerSom() {  
        System.out.println("Latindo");  
    }  
}
```
```Java
class Gato extends Animal {  
    @Override  
    void fazerSom() {  
        System.out.println("Miando");  
    }  
}
```

Uso:
```Java
Animal a1 = new Cachorro();  
Animal a2 = new Gato();  
  
a1.fazerSom();  
a2.fazerSom();
```

✔ Cada um executa um comportamento diferente

---
## ⚠️ Sobrecarga (Overload) ≠ Polimorfismo principal **NÃO VIMOS ISSO AINDA**
Sobrecarga é:
```Java
void som() {}  
void som(String tipo) {}
```

👉 Mesmo nome, parâmetros diferentes

✔ Isso é polimorfismo em tempo de compilação

---

## 🔥 Resumão (prova)
### Herança
- Usa `extends`
- Reutiliza código
- Cria relação "é um"
    - Ex: Aluno **é uma** Pessoa

### Polimorfismo
- Mesmo método → comportamentos diferentes
- Override é o principal
- Funciona com referência da superclasse

---

## 🧠 Dica importante (nível mais alto)
Herança + Polimorfismo permitem:
- código mais flexível
- menos repetição
- facilidade para expandir o sistema

👉 Isso é base de frameworks como Spring (**MATÉRIA AVANÇADA**)

---
# 🔗 Classes de Associação (POO em Java e Banco de Dados)
## 🧩 O que é uma classe de associação?
Uma **classe de associação** representa um **relacionamento entre duas classes que possui atributos próprios**.

👉 Ou seja:  
Não é só “ligar” duas classes — você precisa **guardar informações sobre essa ligação**.

---
## 🧠 Quando usar?
Use classe de associação quando o relacionamento:
- é **muitos-para-muitos (N:N)**
- e possui **dados próprios**

---

## 📚 Exemplo clássico (nível prova)
### Situação:
- Um `Aluno` pode estar em vários `Curso`
- Um `Curso` pode ter vários `Aluno`

👉 Isso é N:N

Mas além disso:
- precisamos guardar a **nota** do aluno no curso
- ou a **data de matrícula**

---
## ❌ Sem classe de associação (errado/incompleto)
```Java
class Aluno {  
    String nome;  
    List<Curso> cursos;  
}
```

```Java 
class Curso {  
    String nome;  
    List<Aluno> alunos;  
}
```

👉 Aqui você NÃO consegue guardar:
- nota
- frequência
- data

---
## ✅ Com classe de associação (correto)

Criamos uma nova classe:
```Java
class Matricula {  
    Aluno aluno;  
    Curso curso;  
    double nota;  
    String data;  
}
```
---
## 🧱 Estrutura completa
```Java
class Aluno {  
    String nome;  
}  
```

```Java  
class Curso {  
    String nome;  
}  
```

```Java
class Matricula {  
    Aluno aluno;  
    Curso curso;  
    double nota;  
}
```
---
## 🎯 Como interpretar isso?
👉 `Matricula` é a **classe de associação**

Ela representa:
- a ligação entre `Aluno` e `Curso`
- informações dessa ligação

---

## 🔄 Como usar na prática
```Java
Aluno a1 = new Aluno();  
a1.nome = "Samuel";  
  
Curso c1 = new Curso();  
c1.nome = "POO";  
  
Matricula m1 = new Matricula();  
m1.aluno = a1;  
m1.curso = c1;  
m1.nota = 9.5;
```
---
## 🧠 Ligação com Banco de Dados (DER)
Isso aqui é MUITO importante:

👉 Classe de associação = tabela associativa

Exemplo no banco:

ALUNO (id, nome)  
CURSO (id, nome)  
MATRICULA (id_aluno, id_curso, nota)

✔ Exatamente o mesmo conceito

---
## 🔥 Vantagens
- Resolve relacionamento N:N
- Permite armazenar dados extras
- Deixa o modelo mais realista
- Facilita manutenção

---
## ⚠️ Pegadinha comum
❌ Criar relacionamento direto quando há atributos:

Aluno → Curso (direto)

👉 Errado se existir:
- nota
- data
- status
- etc.

✔ Sempre use classe de associação nesses casos

---

## 💡 Exemplo mais próximo do nosso projeto
Pensando no nosso sistema de voluntários:
- `Voluntario`
- `AreaAtuacao`

Se houver algo como:
- nível de experiência
- tempo de atuação

👉 então você precisa de algo como:
```Java
class VoluntarioArea {  
    Voluntario voluntario;  
    AreaAtuacao area;  
    int nivelExperiencia;  
}
```
---
## 🧠 Resumão
- Classe de associação representa um relacionamento com dados próprios
- Usada principalmente em N:N
- Vira uma terceira classe
- Equivalente à tabela associativa no banco
- Exemplo clássico: `Aluno + Curso → Matricula`

---