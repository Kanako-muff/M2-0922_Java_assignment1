package com.javaAnimalClsFile;

import com.javaAnimalClsFile.Crocodile.Crocodile;
import com.javaAnimalClsFile.Eal.Eal;
import com.javaAnimalClsFile.Eagle.Eagle;

public class App {
    public static void main(String args[]) throws Exception {
        // instantiation
        Crocodile crocodile = new Crocodile();
        Eal eal = new Eal();
        Eagle eagle = new Eagle();

        // call showInfo methods
        System.out.println("\n---Crocodile---");
        crocodile.showInfo();
        System.out.println("\n---Eal---");
        eal.showInfo();
        System.out.println("\n---Eagle---");
        eagle.showInfo();
    }
}