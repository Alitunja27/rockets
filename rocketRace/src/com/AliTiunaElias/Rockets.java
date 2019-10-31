package com.AliTiunaElias;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Rockets {
    protected String name;
    protected Integer numberOfPropulsors;

    public Rockets (String name, Integer numberOfPropulsors ){
        this.name = name;
        this.numberOfPropulsors = numberOfPropulsors;
    }

    public static List<Integer> speedUp(List<Integer> actualPower, List<Propulsors> propulsorRangePower){
        for (int i=0;i<actualPower.size();i++) {
            if (actualPower.get(i) <= (propulsorRangePower.get(i).maximum - 10)) {
                actualPower.set(i, (actualPower.get(i) + 10));
            }
        } return actualPower;
    }
    public static List<Integer> speedDown(List<Integer> actualPower, List<Propulsors> propulsorRangePower){
        for (int i=0;i<actualPower.size();i++) {
            if (actualPower.get(i) >= (propulsorRangePower.get(i).minimum + 10)) {
                actualPower.set(i, (actualPower.get(i) - 10));
            }
        } return actualPower;
    }
    public static String toString (List<Integer> list){
        String formattedTOString = list.toString()
                .replace("[","")
                .replace("]","")
                .replace(" ","");
        return formattedTOString;
    }
    public static float speed (List<Integer> actualPower,List<Propulsors> propulsorsRangePower, float actualSpeed){
        Integer propulsorPower = 0;
        for (int i=0;i<propulsorsRangePower.size();i++){
            propulsorPower = propulsorPower + actualPower.get(i);
        }
        float speed = (float) (actualSpeed + (100*(Math.sqrt(propulsorPower))));
        return speed;
    }

}
