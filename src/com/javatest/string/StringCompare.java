package com.javatest.string;

public class StringCompare {
    public static void main(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3= new String("Sachin");
        String s4="Saurav";
        String s5="SACHIN";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));//true
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false (because s3 refers to instance created in nonpool)
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s4));//-18(because s1>s4)
        System.out.println(s4.compareTo(s1));//18(because s4 < s1 )

        /**
         * Suppose s1 and s2 are two String objects. If:
         * s1 == s2 : The method returns 0.
         * s1 > s2 : The method returns a positive value.
         * s1 < s2 : The method returns a negative value.
         */
    }
}
