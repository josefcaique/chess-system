# ♟️ Chess Game

Este projeto é uma simulação completa de um jogo de xadrez no terminal, desenvolvida 100% em Java puro, sem o uso de frameworks externos. A aplicação roda diretamente no console e permite partidas completas com todas as regras tradicionais implementadas.

---

## 🚀 Funcionalidades

- Movimentação de peças com regras oficiais de xadrez
- Validação de jogadas
- Detecção de **xeque** e **xeque-mate**
- Suporte a jogadas especiais:
  - Roque (castling)
  - Captura en passant
  - Promoção de peão
- Alternância entre turnos
- Exibição visual do tabuleiro no console com coordenadas

---

## 🛠️ Tecnologias Utilizadas

- Java (puro – sem frameworks)

---

## 📂 Estrutura do Projeto

```
src/
├── application/
│   ├── Main.java
│   └── UI.java
├── boardgame/
│   ├── Board.java
│   ├── Position.java
│   └── ...
├── chess/
│   ├── ChessMatch.java
│   ├── ChessPiece.java
│   ├── ChessPosition.java
│   ├── ChessException.java
│   ├── Color.java
│   └── pieces/
│       ├── King.java
│       ├── Queen.java
│       ├── Bishop.java
│       ├── Knight.java
│       ├── Rook.java
│       └── Pawn.java
```

---

## 💻 Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/chess-game.git
   ```

2. Navegue até o diretório:
   ```bash
   cd chess-game
   ```

3. Compile e execute o projeto:
   ```bash
   javac src/application/Main.java
   java application.Main
   ```

> Se estiver utilizando uma IDE como IntelliJ IDEA ou Eclipse, basta abrir o projeto e clicar em **Run** no arquivo `Main.java`.

---

## 🖼️ Exemplo de Execução

![Exemplo da simulação no console](caminho/para/screenshot.png)  
*(Imagem exibindo o tabuleiro com as peças, coordenadas e jogadas no terminal)*

---

## 👨‍💻 Autor

- **Josef Caique**  
[GitHub](https://github.com/seu-usuario) | [LinkedIn](https://www.linkedin.com/in/seu-perfil)

---

## 📃 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais informações.

---
