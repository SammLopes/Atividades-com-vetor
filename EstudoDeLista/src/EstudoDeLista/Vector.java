package EstudoDeLista;
import java.util.Iterator;
import java.util.Vector;
public class Vector {
    public static void main(String[] args){
       
        Vector al = new Vector();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);
        
        Iterator iter1 = al.iterator();
        
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        System.out.println(al.get(2));
        
    
    }
    
}
