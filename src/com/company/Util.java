package com.company;

import java.util.ArrayList;


public final class Util {



    public static final ArrayList<Integer> stringToArray(String cadena) throws Exception
    {
        ArrayList<Integer> lista = new ArrayList<>();

        int longitudCadena = cadena.length();

        if (cadena.charAt(0) !='[' || cadena.charAt(longitudCadena - 1) != ']') {
            throw new Exception("No empieza o termina en corchete");

        }

        String enterosString = cadena.substring(1,longitudCadena-1);


        longitudCadena = enterosString.length();

        int i=0;
        String num="";
        char caracter =' ';
        while (i < enterosString.length())
        {
            caracter = enterosString.charAt(i);
            if (Character.isDigit(caracter))
            {
                num+=caracter;
                if (i==enterosString.length()-1) lista.add(Integer.parseInt(num));
            }
            else if (caracter == ',' && i<enterosString.length()-1) {

                lista.add(Integer.parseInt(num));
                num="";


            }
            else throw new Exception("Formato incorrecto");


            i++;


        }

        return lista;

        }






}
