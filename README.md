### Hexlet tests and linter status:
[![Actions Status](https://github.com/IPetrovRed/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/IPetrovRed/java-project-61/actions)
# java-package

## Asciinema:
[https://asciinema.org/a/cwfM42L670wFBNd5VlxREIksg](https://asciinema.org/a/DUq8nqUCX6Gfq58HkELBpvDsB)

## Игры разума
Проект представлен пятью играми: *"Проверка на чётность"*, *"Калькулятор"*, *"НОД"*, *"Арифметическая прогрессия"*, *"Простое ли число?"*
При старте проекта выводится текстовое меню выбора игр, которое, помимо пяти игр, включает два дополнительных пункта: первый - это *"Приветсвие"* и последний - *"Выход"*.

# Меню выбора игры:
```
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice:
```

Необходимый пункт меню нужно выбрать вводом соответсвующего номера с клавиатуры.
В случае выбора "Приветствия" программа завершается после ввода имени игрока, поприветствовав его.

# Прим реализации "Приветсвия:
```
Welcome to the Brain Games!
May I have your name?
Hello, Bill!
```

При старте каждая из игр также предлагает ввести имя игрока с клавиатуры и, после его приветствия, выводит вопрос и три случайных варианта условий для решения.
Числовые ответы вводятся игроком с клавиатуры.

В случае трех верных ответов выводится поздравление игрока.

```
Correct!
Congratulations, Bill! 
```
В слачае ошибки - игра прерывается сообщением о "неверном ответе" и завершением программы.

```
'72' is wrong answer ;(. Correct answer was '70'
Let's try again, Bill!
```
Первые четыре шага выполнения проекта посвящены обучению настройки окружения и реппозитория.

## Start

```bash
make
```

## Setup

```bash
make build
```

## Run

```bash
make run
```

# Run-dist

```bash
make run-dist
```

## Run tests

```bash
make test
```

## Run checkstyle

```bash
make lint
```

## Check update dependencies and plugins

```bash
make check-deps
```
