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
public class Balok extends PersegiPanjang{
    protected float tinggi;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public float Volume() {
        float volume = panjang * lebar * tinggi;
        return volume;
    }

    // overload 
    public float Luas(float panjang,float lebar,float tinggi) {
        float luasP = (panjang * lebar + panjang * tinggi + lebar * tinggi) * 2;
        return luasP;
    }
}
