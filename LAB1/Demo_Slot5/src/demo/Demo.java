/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author giaph
 */
class A{
    int NhietDo;

    public int getNhietDo() {
        return NhietDo;
    }

    public void setNhietDo(int NhietDo) {
        this.NhietDo = NhietDo;
    }
}
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        A obj = new A();
        obj.setNhietDo(5);
        System.out.println("Nhiet do: " + obj.getNhietDo());
    }
    
}
