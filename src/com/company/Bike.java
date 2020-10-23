package com.company;

public class Bike extends Car{

    public Bike(String model, int year) {
        super(model, year);
    }
    @Override
    public String carBeep(String sound, int num){
        for (int i = 0; i <num ; i++) {
            System.out.println(sound);

        }
        return sound;
    }


    }

