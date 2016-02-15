package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by b029975 on 2/15/2016.
 */
public class RightToLeft implements  CalculateString {

    StringMap stringMap = new StringMap();
    public HashMap<String, Integer> strings = stringMap.getIntegerStrings();
    private int thousandsPlace;
    private int hundredsPlace;
    private int tensPlace;

    public int convertStringToInteger(String stringInt){
        String[] stringSentence = stringInt.split(" ");
        for(int i = stringSentence.length -1; i > -1; i-- ){
            if(stringSentence[i].equals("thousand")){
                setThousandsPlace(1000);
            }
            if(stringSentence[i].equals("hundred")){
                checkDigitPosition(100);
                if(getThousandsPlace() == 0){
                    setHundredsPlace(100);
                }
            }
           for(Map.Entry<String,Integer> entry : strings.entrySet()){
               if(stringSentence[i].equals(entry.getKey())){
                  checkDigitPosition(entry.getValue());
                   if(getHundredsPlace() == 0 && getThousandsPlace() == 0){
                       setTensPlace(entry.getValue());
                   }
               }
           }
        }
        return getThousandsPlace() + getHundredsPlace() + getTensPlace();
    }

    public void checkDigitPosition(int value){
        if(getThousandsPlace() > 0){
            setThousandsPlace(getThousandsPlace() * value);
        }
        else if(getHundredsPlace() > 0){
            setHundredsPlace(getHundredsPlace() * value);
        }
    }

    public void setTensPlace(int tensPlace){
        this.tensPlace = tensPlace;
    }

    public int getTensPlace(){
        return tensPlace;
    }

    public void setHundredsPlace(int hundredsPlace){
        this.hundredsPlace = hundredsPlace;
    }
    public int getHundredsPlace(){
        return hundredsPlace;
    }

    public void setThousandsPlace(int thousandsPlace){
        this.thousandsPlace = thousandsPlace;
    }

    public int getThousandsPlace(){
        return thousandsPlace;
    }
}
