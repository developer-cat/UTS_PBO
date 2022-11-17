package BangunDatar.com.persegi.panjang;
import BangunDatar.BangunDatar;

public class PersegiPanjang implements BangunDatar{
    double panjang;
    double lebar;
    double luas_persegi_panjang;

    public PersegiPanjang(double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void luas() {
        luas_persegi_panjang = this.panjang*this.lebar;
    }

    @Override
    public double getLuas(){
        return luas_persegi_panjang;
    }
    
}