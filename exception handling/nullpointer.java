public class nullpointer{  
    public static void main(String args[]){  
     try{  
        //code that may raise exception  
        String s=null;  
        System.out.println(s.length());//NullPointerException    
     }catch(Exception e){System.out.println(e);}  
     //rest code of the program   
     System.out.println("rest of the code...");  
    }  
  }  