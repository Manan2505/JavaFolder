package Strings;
import java.util.*;
public class StringClass {
    public static void main(String[] args) {
//        String series="";
//        char ch=0;
//        for(int i=0; i<99; i++){
//           ch=(char)('a'+i);
//           series +=ch;
//
//        }
//        System.out.println(series);

        // IN above we are creating so many objects, resulting in memory wastage. Therefore use arrays.
        // Arrays example below.

//        char[] arr=new char[26];
//        char ch=0;
//        for(int i=0; i<arr.length; i++){
//             arr[i]=(char)('a'+i);
//            System.out.println(arr[i]);
//            //System.out.println(arr[1]);
//        }
//        System.out.println("you are great " + arr[2]);
        String a="manan";
        int len=a.length();
        System.out.println(len);
    }
}
