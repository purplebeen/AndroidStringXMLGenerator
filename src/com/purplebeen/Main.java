package com.purplebeen;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String value = "";  //String Array로 만들 데이터를 넣어주세요
        List<String> values = Arrays.asList(value.split("\n"));
        for (int i = 1; i < values.size(); i++) {
            System.out.println("<item name=\"" + i + "\">" + values.get(i) + "</item>");
        }
    }
}
