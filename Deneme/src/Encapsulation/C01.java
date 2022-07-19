package Encapsulation;

public class C01 {
    // Encapsule edecegimiz 2 veriable olusturalim

    private int sayi;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getSayi() { // sadece degeri gosterir
        return sayi;
    }

    public void setSayi(int sayi) { // sadece deger girebilir
        this.sayi = sayi;
    }

    @Override
    public String toString() {
        return "C01{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }
}
