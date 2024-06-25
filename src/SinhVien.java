import java.util.Comparator;

public class SinhVien extends Nguoi implements Comparator<SinhVien>,Runnable {
    private int id;
    private String lop;

    private double gpa;
    private long time;
    public SinhVien() {
        super("Nguyen Van A", 20);
    }

    public SinhVien(String ten, int tuoi, int id, String lop, double gpa) {
        super(ten, tuoi);
        this.id = id;
        this.lop = lop;
        this.gpa = gpa;
    }


    public SinhVien(String ten, int tuoi, int id, String lop) {
        super(ten, tuoi);
        this.id = id;
        this.lop = lop;
    }

    public SinhVien(long time, String ten){
        super(ten,18);
        this.time = time;

    }

    public int getId() {
        return id;
    }
    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public void toiLa(){
        System.out.println("toi la sinh vien");
    }

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getGpa() < o2.getGpa()) {
            return 1;
        }
        return -1;
    }

    @Override
    public void run() {
        for(int i = 0; i < time; i++){
            System.out.print(getTen());
        }
    }
}
