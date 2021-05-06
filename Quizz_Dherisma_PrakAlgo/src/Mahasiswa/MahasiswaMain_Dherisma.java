/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MahasiswaMain_Dherisma {
    static void menu(){
        System.out.println("\n==========================================");
        System.out.println("     SISTEM PENGOLAH DATA MAHASISWA       ");
        System.out.println("==========================================");
        System.out.println("");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tambah Data Mahasiswa Posisi Akhir");
        System.out.println("3. Tambah Data Mahasiswa Posisi Awal");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Hapus Data Mahasiswa Posisi Awal");
        System.out.println("6. Hapus Data Mahasiswa Posisi Akhir");
        System.out.println("7. Cetak Data Mahasiswa");
        System.out.println("8. Temukan Data Mahasiswa Urutan Pertama");
        System.out.println("9. Cari Data Mahasiswa (Melalui NIM)");
        System.out.println("10. Urut data Mahasiswa (Melalui IPK)");
        System.out.println("");
        System.out.println("==========================================");
    }
        
        public static void main(String[] args) throws Exception {
        DoubleLinkedLists_Dherisma dm = new DoubleLinkedLists_Dherisma();
        Scanner sc = new Scanner(System.in);
//        Stack lb = new Stack();
        int option, indeks, nim;
        String jurusan, nama, prodi;
        double ipk;
        do{
            menu();
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 1:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM       : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama      : ");
                    nama = sc.nextLine();
                    System.out.print("Jurusan   : ");
                    jurusan = sc.nextLine();
                    System.out.print("Prodi     : ");
                    prodi = sc.nextLine();
                    System.out.print("IPK       : ");
                    ipk = sc.nextDouble();
                    System.out.print("Indeks ke-");
                    indeks = sc.nextInt();
                    
                    Mahasiswa dtt = new Mahasiswa(nim, nama, jurusan, prodi, ipk);
                    dm.add(dtt, indeks);
                    break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM       : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama      : ");
                    nama = sc.nextLine();
                    System.out.print("Jurusan   : ");
                    jurusan = sc.nextLine();
                    System.out.print("Prodi     : ");
                    prodi = sc.nextLine();
                    System.out.print("IPK       : ");
                    ipk = sc.nextDouble();
                    Mahasiswa dtl = new Mahasiswa(nim ,nama, jurusan, prodi, ipk);
                    dm.addLast(dtl);
                    break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM       : ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama      : ");
                    nama = sc.nextLine();
                    System.out.print("Jurusan   : ");
                    jurusan = sc.nextLine();
                    System.out.print("Prodi     : ");
                    prodi = sc.nextLine();
                    System.out.print("IPK       : ");
                    ipk = sc.nextDouble();
                    Mahasiswa dtf = new Mahasiswa(nim ,nama, jurusan, prodi, ipk);
                    dm.addFirst(dtf);
                    break;
                case 4:
                    System.out.print("Hapus data indeks ke-");
                    indeks = sc.nextInt();
                    dm.remove(indeks);
                    break;
                case 5:
                    dm.removeFirst();
                    break;
                case 6:
                    dm.removeLast();
                    break;
                case 7:
                    dm.print();
                    break;
                case 8:
                    dm.peek();
                    break;
                case 9:
                    System.out.println("Cari data");
                    System.out.print("Masukkan NIM yang Dicari : ");
                    int cari = sc.nextInt();
                    dm.findSeq(cari);
                    break;
                case 10:
                    System.out.println("Mengurutkan Data (IPK-DESC)");
                    dm.selectionSort(true);
                    dm.print();
                    break;
                default:
                    System.out.print("Keluar, Tidak ada opsi");
            }
            
        } while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5 || option == 6
                || option == 7 || option == 8 || option == 9 || option == 10);
    }
}
