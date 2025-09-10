## Profil
---
- **Nama:** Ghendida Gantari Ayari
- **NIM:** 2409116080
- **Tema:** Manajemen Daftar Hewan Di Kebun Binatang

## Deskripsi
---
Program ini adalah sebuah program sederhana CRUD dengan tema manajemen daftar hewan kebun binatang. Di program ini user dapat membuat, membaca, mengedit, dan menghapus data hewannya.

## Kode

```java FILENAME=ManajemenHewan.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Hewan> daftarHewan = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("=========================================");
            System.out.println("Manajemen Daftar Hewan Kebun Binatang");
            System.out.println("=========================================");
            System.out.println("| 1. Tambah Hewan                      |");
            System.out.println("| 2. Lihat Daftar Hewan                |");
            System.out.println("| 3. Ubah Data Hewan                   |");
            System.out.println("| 4. Hapus Hewan                       |");
            System.out.println("| 5. Keluar                            |");
            System.out.println("=========================================");

            System.out.print("Pilih menu yang mana: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer setelah nextInt()

            // ... Lanjutan kode Anda (switch case, dll.)
        } while (pilihan != 5);
    }
}
---
Ini adalah kode untuk menampilkan menu dengan ada perulangannya yang ditambahkan, yaitu do while

