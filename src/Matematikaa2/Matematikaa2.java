package Matematikaa2;

public class Matematikaa2 extends Matematika2{
    int modulus;
    
    public Matematikaa2(int a, int b){
        super(a,b);
        this.modulus = a % b;
    }
     public int getModulus(){
         return modulus;
     }
}
