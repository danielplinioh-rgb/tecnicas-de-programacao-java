# Atividade de Autoestudo - Programação Orientada a Objetos (Java)

**Aluno:** [DANIEL PLINIO HENRIQUE DA SILVA]  
**Curso/Turma:** [DSM - TÉCNICAS DE PROGRAMAÇÃO]  
**Ambiente:** GitHub Codespaces / VS Code | JDK 17+  

---

## 📋 Visão Geral do Projeto

Este repositório contém a resolução dos 4 exercícios da Atividade de Autoestudo de POO, estruturados em pacotes dentro do diretório `src/autoestudo/`.

### Resumo dos Exercícios

1. **Exercício 1 (`autoestudo.exercicio1`) - Encapsulamento**
   - **Domínio:** Cofrinho Digital.
   - **Descrição:** A classe `Cofrinho` protege o acesso direto ao atributo `saldo`. Alterações só ocorrem via `depositar()` e `retirar()`, aplicando validações contra saques maiores que o saldo e depósitos negativos.

2. **Exercício 2 (`autoestudo.exercicio2`) - Herança**
   - **Domínio:** Plataforma de Conteúdos Educacionais.
   - **Descrição:** Reutilização de atributos e comportamentos através da superclasse `Conteudo`, herdada pelas subclasses `VideoAula` e `Podcast` utilizando a palavra-chave `extends` e chamadas via `super()`.

3. **Exercício 3 (`autoestudo.exercicio3`) - Polimorfismo por Sobrecarga**
   - **Domínio:** Calculadora.
   - **Descrição:** Implementação de polimorfismo estático. O método `somar()` possui 3 assinaturas distintas na mesma classe (variando tipo e quantidade de parâmetros), resolvidas em tempo de compilação.

4. **Exercício 4 (`autoestudo.exercicio4`) - Integração dos Conceitos**
   - **Domínio:** Sistema de Pagamentos.
   - **Descrição:** Aplicação conjunta de Encapsulamento (atributos privados), Herança (`PagamentoPix` e `PagamentoCartao` herdando de `Pagamento`) e Polimorfismo Dinâmico (sobrescrita dos métodos `calcularTaxa()` e `processar()` com `@Override`).

---

## 🧩 Conceitos de POO Aplicados

| Conceito | Onde foi utilizado | Finalidade Prática |
| :--- | :--- | :--- |
| **Encapsulamento** | `Cofrinho.java`, `Pagamento.java` | Esconder detalhes internos e proteger atributos (`private`) contra estados inválidos. |
| **Herança** | `VideoAula`, `Podcast`, `PagamentoPix`, `PagamentoCartao` | Reutilizar código base estabelecendo relações do tipo *"é um"*. |
| **Sobrecarga (Sobrecarga de Métodos)** | `Calculadora.java` | Permitir um mesmo nome de método para diferentes tipos/quantidades de entradas. |
| **Sobrescrita (`@Override`)** | `PagamentoPix.java`, `PagamentoCartao.java` | Redefinir em tempo de execução o comportamento de um método herdado da superclasse. |

---
