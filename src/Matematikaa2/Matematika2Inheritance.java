package Matematikaa2;

public class Matematika2Inheritance {
    public static void main (String[] args){
        Matematikaa2 mtk = new Matematikaa2(10,3);
        
        System.out.println("Pertambahan: " + mtk.getPertambahan());
        System.out.println("Pengurangan: " +mtk.getPengurangan());
        System.out.println("Perkalian: " +mtk.getPerkalian());
        System.out.println("Pembagian: " +mtk.getPembagian());
        System.out.println("Modulus: " +mtk.getModulus());
    }
}
