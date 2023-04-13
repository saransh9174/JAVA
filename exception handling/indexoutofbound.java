public class indexoutofbound{  
    public static void main(String args[]){  
     try{  
        //code that may raise exception  
        int a[]=new int[5];  
        a[10]=50;   
     }catch(Exception e){System.out.println(e);}  
     //rest code of the program   
     System.out.println("rest of the code...");  
    }  
  }  