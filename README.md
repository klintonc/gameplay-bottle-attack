# Gameplay Bottle Attack

A turn-based battle simulator written in Java. Two teams (A and B) each line up players in a front and back row, then fight round by round until one team is wiped out or 100 rounds pass. Each player type has its own attack and special ability:

| Type      | Special ability                    |
|-----------|------------------------------------|
| Healer    | Heals the ally with the lowest HP % |
| Tank      | Taunts enemies to attack it        |
| Samurai   | Double-slashes a target            |
| BlackMage | Curses an enemy                    |
| Phoenix   | Revives fallen allies              |
| Cherry    | Puts enemies to sleep              |

Each team may have at most 3 players of the same type. After every round, the arena prints the board and appends both teams' total HP to `battle_log.txt`.

This is Project 1 for **ITCS208 Object Oriented Programming**, Faculty of ICT, Mahidol University (MUICT).

## Project structure

- `Arena.java`: team setup, validation, battle loop, and logging
- `Player.java`: player stats, targeting, and special abilities
- `Main.java`: sample entry point that sets up two teams and starts a battle
- `battle_log.simple.txt`, `battle_log.advance.txt`: sample battle logs

## How to run

Requires a JDK (Java 8 or later).

```sh
javac Arena.java Player.java Main.java
java Main
```

Each round is printed to the terminal, and `battle_log.txt` is written to the current directory. To try a different matchup, edit the `addPlayer(...)` calls in `Main.java`.
