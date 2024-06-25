import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

enum PizzaStatus {
    DATHANG,
    CHUANBI,
    GIAOHANG;
}

public class main{
    public static void main(String[] args)  {
        Person<Integer> p1 = new Person<>(1, 20);
        Person<String> p2 = new Person<>("2", 30);
        System.out.println(p1.getId().getClass());
        System.out.println(p2.getId().getClass());
        Animal a = (firstName) -> {
            {
                System.out.println(firstName);
            }
        };
        a.speak("hello");
        SinhVien sinhVien = new SinhVien();
        Nguoi nguoi = new Nguoi() {
                @Override
                public void toiLa(){
                    System.out.println("toi la giaovien");
                }
        };
        nguoi.toiLa();git 

        String [] ds = {"Tung", "Huy", "Hieu"};
        System.out.println(ds[0]);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        int vitri = list.lastIndexOf(2);
        System.out.println(vitri);
        PizzaStatus status = PizzaStatus.CHUANBI;
        System.out.println(status.toString());
        Integer integer = Integer.valueOf(9);
        System.out.println(integer);
        String chuoi = null;
        try {
            doDaiString(chuoi);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        TaiKhoan taiKhoan = new TaiKhoan(5000);
        try{
            taiKhoan.setSodu(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(taiKhoan.getSodu());
        Map<String,Integer> banggia= new HashMap<>();
        banggia.put("BTC", 50000);
        banggia.put("ETH", 3000);
        banggia.put("ADA", 2);
        banggia.put("XRP", 1);
        HashSet<Integer> setBangGia = new HashSet<>();
        Collection<Integer> listBangGia = new ArrayList<>();
        listBangGia.add(50000);
        listBangGia.add(3000);
        listBangGia.add(2);
        listBangGia.add(1);
        setBangGia.addAll(listBangGia);
        for(String x : banggia.keySet()){
            if(banggia.containsKey(x)){
                System.out.println(x + " : " + banggia.get(x));
            }
        }
        SinhVien sv1 = new SinhVien("Tung", 20, 1, "KTPM", 3.5);
        SinhVien sv2 = new SinhVien("Huy", 20, 2, "KTPM", 2.9);
        SinhVien sv3 = new SinhVien("Hieu", 20, 3, "KTPM", 3.1);
        SinhVien sv4 = new SinhVien("Hieu", 20, 3, "KTPM", 2.1);
        SinhVien sv5 = new SinhVien("Hieu", 20, 3, "KTPM", 3.3);
        List<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(sv1);
        listSinhVien.add(sv2);
        listSinhVien.add(sv3);
        listSinhVien.add(sv4);
        listSinhVien.add(sv5);
//        listSinhVien.sort((SinhVien o1, SinhVien o2) -> {
//            if(o1.getGpa() < o2.getGpa()) return 1;
//            return -1;
//        });
        listSinhVien.sort(new SinhVien());
        for(SinhVien x : listSinhVien){
            System.out.println(x.getTen() + " " + x.getGpa());
        }

        try {
            FileReader reader = readFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println("----------------------");
        for (Integer x : queue) {
            System.out.println(x);
        }
        System.out.println("===========================================");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        for (Integer x : stack) {
            System.out.println(x);
        }
        Runnable t1 = new  SinhVien(100, "A");
        Thread thread1 = new Thread(t1);
        Runnable t2 = new SinhVien(100, "X");
        Thread thread2 = new Thread(t2);
        thread2.start();
        thread1.start();

    }

    public static void doDaiString(String chuoi){
        if(chuoi == null){
            throw new NullPointerException("Chuoi khong the la null");
        }
        System.out.println("Do dai chuoi la: " + chuoi.length());
    }

    public static FileReader readFile(String tenFile) throws FileNotFoundException {
        FileReader reader =  new FileReader(tenFile);
        return reader;
    }



}
