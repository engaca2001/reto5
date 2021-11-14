package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        try {
          lista = Util.stringToArray("[152,3,353,4,63333]");
            System.out.println(lista);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }



    }



}
