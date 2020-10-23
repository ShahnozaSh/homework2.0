package com.company;

public class Main {

    public static void main(String[] args) {
	Car objectA = new Car("Mersedes", 2000);
	Bike objectB = new Bike("Trinks", 2020);
	Bike objectC = new Bike("Patrol", 2018);
	objectA.carBeep("Beep",1);
	objectB.carBeep("Gas",2);
	objectC.carBeep("Tormoz",5);
    }



}
