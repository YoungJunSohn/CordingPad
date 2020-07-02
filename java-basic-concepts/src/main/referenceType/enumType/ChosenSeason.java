package main.referenceType.enumType;



public class ChosenSeason {
    public static void main(String[] args) {

        for(Season season : Season.values()){
            System.out.println(season.getSeason()); //season에 나열된 문자 봄, 여름, 가을, 겨울이 출력된다.
        }
    }//main
}//ChosenSeason
