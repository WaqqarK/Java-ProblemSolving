public class PrimeFactors{
    public static boolean isPrime(int a){// isprime method mein value define nhi kiye hai bs logic likhe hai
    
        //agar a ka value 7 aaya toh 
        if(a == 1){// isme nahi jayega
            return false;
        }
        for(int i = 2; i < a; i++)//ab yaha aa gya, ar condition check krega
        {
            if(a % i == 0){ // pehla baar mein 7 divide by 2 
            // dusra baar 7 divide by 3
            // tisra baar 7 divide b 4....
                return false;
            }
        }
        return true;
        
    }
     public static void main(String []args){
     int n = 315;
     
     for(int i=2; i<= n; i++)
     {
         int x=i;
         while(n%x==0)
         {
             if(isPrime(i)){
                 System.out.println(i);
                 
             }
             x=x*i;
             
         }
     }
     }
}
