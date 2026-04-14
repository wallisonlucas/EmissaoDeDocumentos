# 🖨️ Emissão de Documentos — Padrão de Projeto Factory Method

> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Factory Method** para geração de documentos de diferentes tipos de forma organizada e extensível.

---

## 📌 Sobre o projeto

Este projeto simula um sistema de emissão de documentos corporativos, onde uma empresa precisa gerar arquivos em diferentes formatos **PDF**, **Word** e **Planilha** para finalidades distintas. Utilizando o **padrão Factory Method**, o sistema delega a criação dos documentos às fábricas concretas, sem que o código principal precise conhecer ou instanciar as classes diretamente.

---

## 🎯 Objetivo

Aplicar o padrão **Factory Method** para:

- Isolar a criação de objetos do código que os utiliza
- Evitar blocos de `if/else` e instâncias espalhadas com `new`
- Facilitar a adição de novos tipos de documento sem alterar o código existente

---

## 🧠 O Padrão Factory Method

O **Factory Method** é um padrão criacional que define uma interface para criar objetos, mas deixa as subclasses decidirem qual classe instanciar. O código cliente trabalha apenas com abstrações, sem conhecer as implementações concretas.

## 🗂️ Estrutura do Projeto

```
EmissaoDeDocumentos/
  └── src/
        ├── documentos/
        │     ├── Documento        → interface (contrato base de todo documento)
        │     ├── PDF              → implementação concreta
        │     ├── Planilha         → implementação concreta
        │     └── Word             → implementação concreta
        │
        ├── fabricas/
        │     ├── FabricaDocumento → classe abstrata (Factory Method)
        │     ├── FabricaPDF       → fábrica concreta
        │     ├── FabricaPlanilha  → fábrica concreta
        │     └── FabricaWord      → fábrica concreta
        │
        └── Main
```

A `Main` trabalha apenas com `FabricaDocumento` e `Documento`, sem nenhum `new PDF()`, `new Word()` ou `new Planilha()` diretamente.

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto**.
