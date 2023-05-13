package Strings;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.StringBuilder;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder Sb=new StringBuilder();
        Sb.append("manan Arora");

//        for(int i=0; i<72; i++){
//            char ch=(char)('a'+i);
//            Sb.append(ch);

//
//        }
//        System.out.println(Sb);
//        System.out.println(Sb.length());`
       // System.out.println(Sb.delete(0,2));
       // System.out.println(Sb.capacity());
        //System.out.println(Sb);
       // System.out.println(Sb.indexOf("a", 0));

        //Trying to print all indexes of 'a'

        System.out.println(Sb);
        for (int i=0; i<Sb.length();i++){
            if(Sb.charAt(i)=='a'){
                int index=i;
                System.out.println(index);

            }

        }

    }
}
