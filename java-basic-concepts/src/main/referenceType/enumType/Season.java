package main.referenceType.enumType;

import java.util.Arrays;

public enum Season{
    //상수("연결할 문자")
    SPRING("봄"),
    SUMMER("여름"),
    AUTUMN("가을"),
    WINTER("겨울");

    final private String season;

    private Season(String season){ //enum에서 생성자 역할을 하는 메서드
        this.season = season;
    }

    public String getSeason(){ //문자를 받아오는 메서드
        return season;
    }
}//enum



