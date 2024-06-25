public class Nguoi {
    private String ten;
    private int tuoi;

    public Nguoi(){

    }

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public String getTen() {
        return ten;
    }
    public int getTuoi() {
        return tuoi;
    }

    public void toiLa(){
        System.out.println("toi la nguoi");
    }
}
