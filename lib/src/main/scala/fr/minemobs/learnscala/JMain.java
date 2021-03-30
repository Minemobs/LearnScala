package fr.minemobs.learnscala;

import java.util.Scanner;

public class JMain {

    public String getUsername(){
        System.out.println("What's your name ?");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
