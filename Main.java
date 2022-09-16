public class Main {
    public static void main(String[] args){
        int n=0;
       for(int a=1; a<9; a++){
           for(int b=1; b<9; b++){
               if (a==b){
                   continue;
               }
               for(int c=3; c<10; c++){
                   n++;
                   if (a+b==c){
                       System.out.println("a:" + a + " b:" + b + " c:" + c);
                   }
               }
           }
       }
        System.out.println(n);
    }
}