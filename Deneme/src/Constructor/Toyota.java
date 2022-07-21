package Constructor;

public class Toyota {
    String marka = "Toyota";
    int tekerAdedi = 4;
    boolean motoruVarMi = true;
    String model;
    String yakit;
    int yil;

    public Toyota(String model, String yakit, int yil) {
        this.model=model;
        this.yakit=yakit;
        this.yil=yil;
    }
    public Toyota(){

    }

    public void maxHız(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240 km hiz yapar");
        } else if (yakit.equals("Dizel")) {
            System.out.println("Dizel araclar max 260 km hiz yapar");
        }
    }

    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla icin renk tercihleri Kirmizi - Beyaz");
        } else if (model.equals("Yaris")) {
            System.out.println("Yaris icin renk tercihleri Siyah - Beyaz");
        }
    }

    public String toString(){
        String info = "Marka: " + marka + "\nModel: " + model +
                "\nTeker adedi: " + tekerAdedi + "\nMotoru var mi: " +motoruVarMi
                + "\nYakit: " +yakit + "\nYil: " +yil;

        return info;
    }



}
