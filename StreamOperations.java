package com.edu.java8features;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class StreamOperations{
           public static void main(String args[]){
          //Take a string type array and convert into list

     List<String>lst =Arrays.asList("USA","Japan","India","China", "","Russia","uk");
//count  the number of strings with length more than 4 characters


long n=lst.stream().
filter(x->x.length()>4).count();
 System.out.println("No.of strings with length more than 4:\n "+n);

//count no. of strings with starts with "u"

n=lst.stream().filter(x->x.startsWith("u")).count();

System.out.println("No.of strings starting with u:\n" +n);


//remove all empty empty strings from the list 
//and collect them into a another list

List<String> lst1=lst.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());

System.out.println("The list after removing the empty string :\n"+lst1);

//sort the stream and then convert into upper case and then collect //into  another list

List<String> lst2=lst1.stream().sorted().map(x ->x.toUpperCase()).collect(Collectors.toList());

System.out.println("The list after sorting in uppercase :\n"+ lst2);

//convert all strings to  capital letters and collect them into an array 

String []arr=lst1.stream().map(x->x.toUpperCase()).toArray(String[]::new);

System.out.println("Array of sorted strings in uppercase :");

for(String i: arr){
   System.out.println(i+" ,");
}
}
}
