
public class staticMethod {
     
    public static void main(String[] args) {
//      Print.a("-");
//      Print.b("-");
         
       // instance
       Print t1 = new Print();
       t1.delimiter = "-";
        t1.a();
        t1.b();
       Print.c("$");
        
        
//      Print.a("*");
//      Print.b("*");
        
        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
       t2.b();
    }
     
 
}