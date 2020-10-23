package com.company;

public class Car extends Transport {


    public Car(String model,int year) {
        super(model, year);
    }

    public void carBeep(String sound){
        System.out.println("BEEEEEEEP!!!");
    }

    public String carBeep(String sound, int num){
        for (int i = 0; i <num ; i++) {
            System.out.println(sound);

        }
        return sound;
    }
    public final String carBeep(int num, String sound){
        for (int i = 0; i <num ; i++) {
            System.out.println(sound);
        }
        return sound;
    }

    }

