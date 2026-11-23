# Backup e Restauração com o padrão Command

Simulação em Java de uma casa automatizada. Cada comando executado pelo controle remoto é salvo em disco. Depois de uma pane elétrica, os comandos são carregados do arquivo e executados de novo, na mesma ordem, para os dispositivos voltarem ao estado de antes.

## Estrutura

- `src/command`: interface `Command`, os comandos dos 7 dispositivos e o `RemoteControl` (com `store()`, `load()` e `restore()`)
- `src/device`: `Sound`, `TV`, `CeilingFan`, `GarageDoor`, `Light`, `Hottub` e `SecurityControl`
- `src/Main.java`: configura a casa, simula a pane e restaura tudo

## Como compilar

```
javac -encoding UTF-8 -d out src/Main.java src/command/*.java src/device/*.java
```

## Como rodar

```
java -Dstdout.encoding=UTF-8 -cp out Main
```

A execução cria o arquivo `backup.ser` na pasta atual. As mensagens da segunda parte (restauração) devem repetir as da primeira, na mesma ordem.
