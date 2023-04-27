package tugas1_13020210231;

public class Tugas1_13020210231 {

    
    public static void main(String[] args) {
      Mahasiswa mahasiswa  = new Mahasiswa();
      
      mahasiswa.setNama("Indriana Taib");
      mahasiswa.setAngkatan(2021);
      mahasiswa.setFakultas("Ilmu Komputer");
      
      String nama = mahasiswa.getNama();
      int angkatan = mahasiswa.getAngkatan();
      String fakultas = mahasiswa.getFakultas();
      
      System.out.println("Nama Mahasiswa: " + nama);
      System.out.println("Angkatan Mahasiswa: " + angkatan);
      System.out.println("Fakultas Mahasiswa: " + fakultas);
    }
    
}

