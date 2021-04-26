package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int num = ran.nextInt(10 - 3 + 1); // случайноя длина массива
        Celes[] celBod = new Celes[num]; // массив обьектов

        int diam; // на этом моменте не запускалась программа так как я забыл задать как новый класс новый обьект

        for (int i = 0; i < celBod.length; i++) { // цикл для определения параметров
             diam = ran.nextInt(90000 - 5000 );
             celBod[i] = new Celes();
            celBod[i].diam = diam; // случайный деаметр
            celBod[i].temperatura = ran.nextInt(6000 - (-150) + 1) + (-150); // случайноя температура
            if (celBod[i].diam < 30000 && celBod[i].diam > 10000) { // если диаметр больше 10к и меньше 30к то это планета
                celBod[i].name = "Planet " + i; // Имя обьекта
                if (celBod[i].temperatura > 150) { // если температура больше 150 то это мертвая планета
                    celBod[i].atmospher = false; // не имеет атмсоферу
                    celBod[i].whater = false; // не имеет в своем составе воду
                } else { // иначе имеет в своем сотаве воду и атмосферу
                    celBod[i].atmospher = true;
                    celBod[i].whater = true;
                }
            }
            if (celBod[i].diam < 10000) {  // если обьект мешь 10к то этот обьект меньше планеты
                if (celBod[i].temperatura > 200) {
                    celBod[i].name = " Cameta" + i; // имя обьекта
                    celBod[i].atmospher = false;
                    celBod[i].whater = true;
                } else {
                    celBod[i].name = " Asteroid" + i; // имя обьекта
                    celBod[i].atmospher = false;
                    celBod[i].whater = false;
                }
            }
            if (celBod[i].diam > 30000) { // параметр при котором обьект является звездой
                celBod[i].name = "Satar " + i;
                celBod[i].atmospher = true;
                celBod[i].whater = false;
            }
        }

        for (int i = 0; i<celBod.length;i++){
            System.out.println(i + " Обект наблюдения: ");
            System.out.println("Имя обьекта: " + celBod[i].name);
            System.out.println("Диаметр обьекта: " + celBod[i].diam + " Килосетров");
            System.out.println("Температура обьекта: " + celBod[i].temperatura + " Градусов");
            if (celBod[i].atmospher){
                System.out.println(" Имеет атмосферу");
            }
            else {
                System.out.println("Не имеет Атмосферу");
            }
            if (celBod[i].whater){
                System.out.println(" Имеет в своем составе Воду");
            }
            else {
                System.out.println("Не имеет в своем составе воду");
            }
            System.out.println();
        }
    }
}

 class Celes { // класс небесные тела
    String name; // имя небесного тела
    int diam ; // Диаметр небесного тела
    int temperatura ; // темература небесного тела
    boolean atmospher; // есть ли атмосфера у небесного тела
    boolean whater; // имеет в своем составе воду


}
