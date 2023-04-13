import java.util.*;  
public class foreach_array{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through for-each loop  
  for(String x:list)    
    System.out.println(x);    
  
 }  
}  