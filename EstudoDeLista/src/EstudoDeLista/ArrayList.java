package EstudoDeLista;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList {
     public static void main(String[] args){
          
         ArrayList al = new ArrayList();
       
         al.add(3);
         al.add(2);
         al.add(1);
         al.add(4);
         al.add(5);
         al.add(6);
         al.add(6);
         
         Iterator iter1 = al.iterator();
         while(iter1.hasNext()){//p metodo hasnext() determina se ha mais elemntos a serem iterados 
               System.out.println(iter1.next());
         }
          System.out.println(al.get(2));
     }    

   
   
    }

