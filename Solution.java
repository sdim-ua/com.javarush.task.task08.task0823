package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
import java.io.*;


/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //System.out.println(s);
        //напишите тут ваш код
        String s1 = s, s2 = "";
		s2 = s2 + s1.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
		for (int i = 1; i < s1.length(); i++) {
		    // смотрим, был ли слева пробел:
		    if (" ".equals(s1.substring(i-1, i)))
		        s2 = s2 + s1.substring(i, i+1).toUpperCase();
		    else
		        s2 = s2 + s1.substring(i, i+1);
		}
		//System.out.println(s1);
        System.out.println(s2);
    }
}
