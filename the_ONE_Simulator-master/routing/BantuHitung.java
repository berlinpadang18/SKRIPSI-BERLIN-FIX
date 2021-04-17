/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routing;

/**
 *
 * @author Acer
 */
public class BantuHitung {

    public BantuHitung() {
        
    }
    
    public double pembagi(int x, int y){
        return (double) x/ (double) y;
    }
    
    public double hitungtanimoto (double xy, double x, double y){
//        System.out.println(( a   /  (b + c - a)));
        return ( xy / (x + y - xy)) ;
    }
    public double hitungEuclidean(double a, double b){
        return 1 - (Math.sqrt(a) / (Math.sqrt(b)));
    }
    
    public double kali(double a, double b){
        return a * b;
    }
}
