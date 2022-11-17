package BangunDatar.com.setengah.lingkaran;
import BangunDatar.BangunDatar;

public class SetengahLingkaran implements BangunDatar{
    double jari2;
    double luas_setengah_lingkaran;

    public SetengahLingkaran(double diameter){
        this.jari2 = diameter / 2;
    }

    @Override
    public void luas() {
        luas_setengah_lingkaran = jari2 * jari2 * 3.14 * 0.5;
    }

    @Override
    public double getLuas() {
        return luas_setengah_lingkaran;
    }
    
}
