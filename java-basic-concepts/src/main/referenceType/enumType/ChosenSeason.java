package main.referenceType.enumType;



public class ChosenSeason {
    public static void main(String[] args) {

        for(Season season : Season.values()){
            System.out.println(season.getSeason());
        }
    }//main
}//ChosenSeason
