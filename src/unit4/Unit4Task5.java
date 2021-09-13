package unit4;

import java.util.Scanner;

import static unit4.Main.gameGrid;

class Main {
    static boolean gameFinished = false;
    static final char[][] gameGrid = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}

    }; //объявляю массив символов размерности 3 на 3

    public static void main(String[] args) {
        System.out.println("Игра началась!");
        Player playerGame = new Player();
        byte moveOfPlayers = 1;
        while (!gameFinished) {//пока игра не закончилась - играем

            playerGame.update(gameGrid);
            moveOfPlayers = playerGame.getMoveCounter();
            if (moveOfPlayers > 9) {
                gameFinished = true;
            }//ходов больше нет - ничья
            for (int i = 0; i < gameGrid.length; i++) {
                for (int j = 0; j < gameGrid[i].length; j++) {

                    if (moveOfPlayers > 5) {//до победы надо минимум 5 ходов. нет смысла проверять раньше

                        if ((gameGrid[0][0] == gameGrid[0][1]) && (gameGrid[0][1] == gameGrid[0][2]) && (gameGrid[0][0] != '-')) {
                            gameFinished = true;
                        }
                        if ((gameGrid[1][0] == gameGrid[1][1]) && (gameGrid[1][1] == gameGrid[1][2]) && (gameGrid[1][1] != '-')) {
                            gameFinished = true;
                        }
                        if ((gameGrid[2][0] == gameGrid[2][1]) && (gameGrid[2][1] == gameGrid[2][2]) && (gameGrid[2][2] != '-')) {
                            gameFinished = true;
                        } //проверка на победу по горизонтали

                        if ((gameGrid[0][0] == gameGrid[1][0]) && (gameGrid[1][0] == gameGrid[2][0]) && (gameGrid[0][0] != '-')) {
                            gameFinished = true;
                        }
                        if ((gameGrid[0][1] == gameGrid[1][1]) && (gameGrid[1][1] == gameGrid[2][1]) && (gameGrid[1][1] != '-')) {
                            gameFinished = true;
                        }
                        if ((gameGrid[0][2] == gameGrid[1][2]) && (gameGrid[1][2] == gameGrid[2][2]) && (gameGrid[2][2] != '-')) {
                            gameFinished = true;
                        }//проверка на победу по вертикали

                        if ((gameGrid[0][0] == gameGrid[1][1]) && (gameGrid[1][1] == gameGrid[2][2]) && (gameGrid[2][2] != '-')) {
                            gameFinished = true;
                        }
                        if ((gameGrid[0][2] == gameGrid[1][1]) && (gameGrid[1][1] == gameGrid[2][0]) && (gameGrid[2][0] != '-')) {
                            gameFinished = true;
                        }//проверка на победу по диагонали
                    }

                    System.out.print(gameGrid[i][j] + "\t");//вывод элемента+отступ
                }
                System.out.println();//переход на новую строку для создания сетки игры
            }
        }

        if (gameFinished == true) {
            if (moveOfPlayers < 9) {
                if (moveOfPlayers % 2 == 0) {
                    System.out.println("Крестики выйграли, поздравляем!");
                } else {
                    System.out.println("Нолики выйграли, поздравляем!");
                }
            } else {
                System.out.println("Ничья!");
            }
            System.out.println("Конец игры!");
        }
    }
}

class Player {//Объясню название класса-я планировал сделать режим игры Игрок vs PC. Думал создавать объект игрока или компьютера,
    // в зависимости от того, как хочет играть пользователь.
    String coordinates;
    char coordinateX, coordinateY;
    byte moveCounter = 1; //счетчик хода. нолики ходят по четному счетчику

    public byte getMoveCounter() {
        return moveCounter;
    }

    public void update(char[][] gridOfGame) {

        if (moveCounter % 2 == 0) {
            System.out.println("\tХод №" + moveCounter + ". Нолики, ваша очередь! Введите координаты хода (пример:a2, b1, c3): ");
        } else {
            System.out.println("\tХод №" + moveCounter + ". Крестики, ваша очередь! Введите координаты хода (пример:a2, b1, c3): ");
        }
        Scanner scannerOfPlayerMove = new Scanner(System.in);

        coordinates = scannerOfPlayerMove.next();//заполняю строку

        if (coordinates.length() != 2) {
            System.out.println("Вы ввели не верный формат хода. Попробуйте снова (пример:a2, b1, c3)");
            return;
        }//если пользователь ввёл неверное количество символов (!=2)

        coordinateX = coordinates.charAt(0);
        coordinateY = coordinates.charAt(1);

        int x = 0, y = 0;//переменные для перевода введенных пользователем символов в числа
        switch (coordinateX) {
            case 'a':
                x = 0;
                break;
            case 'b':
                x = 1;
                break;
            case 'c':
                x = 2;
                break;
            default:
                System.out.println("Вы ввели не верный формат хода. Попробуйте снова (пример:a2, b1, c3)\n");
                return;//досрочный выход из ф-ции (чтобы не пойти дальше и не записать х или о в ячейку)
        }
        switch (coordinateY) {
            case '1':
                y = 0;
                break;
            case '2':
                y = 1;
                break;
            case '3':
                y = 2;
                break;
            default:
                System.out.printf("Вы ввели не верный формат хода. Попробуйте снова (пример:a2, b1, c3)\n");
                return;
        }

        if (gridOfGame[x][y] == '-') {
            if ((moveCounter % 2 == 0) && (gridOfGame[x][y] != 'x') && (gridOfGame[x][y] != 'o')) {
                gridOfGame[x][y] = 'o';
                moveCounter++;
            } else {
                gridOfGame[x][y] = 'x';
                moveCounter++;
            }
        } else {
            System.out.println("Клетка занята,попробуйте снова \t");
        }

    }
}