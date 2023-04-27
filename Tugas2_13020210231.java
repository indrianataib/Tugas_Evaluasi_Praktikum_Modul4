package tugas2_13020210231;

public class Tugas2_13020210231 {

    public static void main(String[] args) {
        Orang orang = new Orang();
        Aslab aslab = new Aslab();
        Praktikan praktikan = new Praktikan();
        Jurusan jurusan = new Jurusan();
        
        aslab.nama = "Intje Irfan Ibrahim";
        praktikan.nama = "Indriana Taib";
        jurusan.nama = "Teknik Informatika";
        
        System.out.println("Nama Aslab : "+ aslab.nama);
        System.out.print("Fakultas Aslab : ");
        aslab.tampilkanFakultas();
        
        System.out.println("Nama Praktikan : "+ praktikan.nama);
        System.out.print("Fakultas Praktikan :");
        praktikan.tampilkanFakultas();
        
        System.out.println("Nama Jurusan : "+ jurusan.nama);
        System.out.print("Fakultas Jurusan : ");
        jurusan.tampilkanFakultas();
    }
    
}
