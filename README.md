# 🐾 Herança em Java — Exemplo com Animais

Projeto acadêmico desenvolvido na disciplina de **Análise e Projeto Orientado a Objetos**, com o objetivo de demonstrar o conceito de **herança** na linguagem Java.

---

## 📚 Sobre o Projeto

O projeto modela uma hierarquia simples de animais utilizando os pilares da orientação a objetos. A classe `Animal` serve como **classe base (superclasse)**, enquanto `Gato` e `Cachorro` são **subclasses** que herdam seus atributos e comportamentos, sobrescrevendo o método `emitirSom()` de acordo com cada animal.

---

## 🧱 Estrutura das Classes

```
Animal (superclasse)
├── Gato   (subclasse)
└── Cachorro (subclasse)
```

### `Animal`
Classe base com os atributos comuns a todos os animais:
- `nome` — nome do animal
- `idade` — idade em anos
- `raca` — raça do animal
- `nPatas` — número de patas

**Métodos:**
- `exibirInformacoes()` — imprime os dados do animal
- `emitirSom()` — comportamento genérico, sobrescrito nas subclasses

### `Gato` e `Cachorro`
Herdam todos os atributos de `Animal` e sobrescrevem o método `emitirSom()` com o som característico de cada um.

---

## 💡 Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
|---|---|
| **Herança** | `Gato` e `Cachorro` estendem `Animal` |
| **Polimorfismo** | `emitirSom()` se comporta diferente em cada subclasse |
| **Sobrescrita (`@Override`)** | Redefinição do método nas subclasses |
| **Encapsulamento** | Atributos declarados como `protected` |
| **Upcasting** | Objetos das subclasses referenciados pelo tipo `Animal` |

---

## ▶️ Como Executar

**Pré-requisitos:** Java JDK 8 ou superior instalado.

```bash
# Compilar
javac Animal.java

# Executar
java Animal
```

### Saída esperada:

```
Informações do gato:
Nome: Meia noite
Idade: 10
Raça: siamês
Número de patas: 4
miau!

Informações do cachorro:
Nome: Rex
Idade: 5
Raça: labrador
Número de patas: 4
au au!
```

---

## 🗂️ Arquivos

```
📄 Animal.java   # Contém as classes Animal, Gato e Cachorro
📄 README.md
```

---

## 🎓 Informações Acadêmicas

> Disciplina: Análise e Projeto Orientado a Objetos  
> Tema: Implementação de Herança em Java