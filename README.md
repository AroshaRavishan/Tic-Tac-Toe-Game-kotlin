# Kotlin Tic Tac Toe Game

A simple command-line Tic Tac Toe game implemented in Kotlin.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Game Rules](#game-rules)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This is a command-line Tic Tac Toe game developed in Kotlin. It allows two players to play the game on a 3x3 grid. The game checks for win conditions, draws, and handles invalid moves gracefully.

## Features

- Two-player mode
- Input validation
- Win detection
- Draw detection
- Simple and clean command-line interface

## Installation

To run the game, ensure you have Kotlin installed on your system. You can download Kotlin from the [official website](https://kotlinlang.org/).

1. Clone this repository:
    ```sh
    git clone https://github.com/yourusername/kotlin-tic-tac-toe.git
    ```
2. Navigate to the project directory:
    ```sh
    cd kotlin-tic-tac-toe
    ```
3. Compile the Kotlin source files:
    ```sh
    kotlinc src -include-runtime -d TicTacToe.jar
    ```
4. Run the game:
    ```sh
    java -jar TicTacToe.jar
    ```

## Usage

Once the game starts, you will see a 3x3 grid representing the Tic Tac Toe board. Players take turns to input their moves. Player 1 uses `X` and Player 2 uses `O`.

To make a move, enter the row and column numbers when prompted. The rows and columns are indexed from 1 to 3.


## Game Rules

1. The game is played on a 3x3 grid.
2. Player 1 is `X` and Player 2 is `O`.
3. Players take turns placing their marks in empty squares.
4. The first player to get three of their marks in a horizontal, vertical, or diagonal row wins.
5. If all nine squares are filled and neither player has three in a row, the game is a draw.

## License

This project is licensed under the Arosha Ravishan License. See the [LICENSE](LICENSE) file for details.

