/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author giaph
 */
public class BanhXe {
    int Size;
    protected int Hoi;

    public BanhXe(int Size, int Hoi) {
        this.Size = Size;
        this.Hoi = Hoi;
    }
    
    protected void BomHoi(int i) {
        this.Hoi = this.Hoi + i;
        System.out.println("Banh xe: Size " + this.Size + " Hoi: " + this.Hoi);
    }
    private void BomHoi1(int i) {
        BomHoi(i);
    }
    
}
