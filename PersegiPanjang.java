/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author London
 */
public class PersegiPanjang {
    protected float panjang;
    protected float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
public float Keliling() {
        float keliling = (panjang+lebar) * 2;
        return keliling;
    }

    public float Luas() {
        float luas = panjang * lebar;
        return luas;
    }
}
