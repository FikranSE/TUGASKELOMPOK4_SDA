// ALGORITMA PROJECT KELOMPOK 4
// 1.pelanggan memesan ( minuman : Boba/makanan : Mie ) 
// { Masuk antrian pertama, tumpukan piring kurang satu,Proses...} ( QUEUE )( STACK_POP )
// 2.Pesanan pelanggan siap { antrian pertama keluar }( QUEUE_POLL) 
// 3.Lihat data Pelanggan ( Data lengkap, Total, siapa pelanggan pertama ) ( SIZE & PEEK) 
// 4.Hapus data pelanggan { pelanggan menghilang, pelayanan yang diminta tidak disediakan } ( REMOVE ) 
// 5.Cek Piring :
//               • Lihat jumlah piring
//               • Tambah piring ( STACK_PUSH) 
// 6.Keluar/Exit.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.io.*;

public class Main  {

    public static void main(String[] args) {
        
        //deklarasi variabel
        int menu,Pmenu,CekP,inputMie,Pesanan;
        String nama,tambahPesanan,PMie,hapusNama,hapusPesanan,hapusMie,jwb;
        //deklarasi array
        String[] arrPesanan;
        arrPesanan = new String[6];
        String[] mie;
        mie = new String[4];
        
        //Minuman
        arrPesanan[0] = "BOBA";
        arrPesanan[1] = "CAPPUCINO";
        arrPesanan[2] = "GREEN TEA";
        arrPesanan[3] = "LATTE";
        arrPesanan[4] = "LEMON TEA";
        arrPesanan[5] = "MOCCA";
        //Makanan
        mie[0] = "MIE REBUS";
        mie[1] = "MIE GORENG";
        mie[2] = "MIE ACEH";
        mie[3] = "MIE SOTO";
        
        //deklarasi input
        Scanner input=new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Scanner iPesan = new Scanner(System.in);
        Scanner PilihMenu = new Scanner(System.in);
        Scanner jwbPesan = new Scanner(System.in);
        Scanner Pcek = new Scanner(System.in);
        Scanner rmvN = new Scanner(System.in);
        Scanner rmvK = new Scanner(System.in);
        Scanner rmvMie = new Scanner(System.in);
        Scanner InMie = new Scanner(System.in);
        Scanner PushMie = new Scanner(System.in);
        //deklarasi queue
        Queue<String> name= new LinkedList<>();
        Queue<String> pesan= new LinkedList<>();
        Queue<String> pesanMie= new LinkedList<>();
        //deklarasi stack
        Stack<String> piring = new Stack<String>();
        //MIE 1
        piring.push("Piring-1");
        piring.push("Piring-2");
        piring.push("Piring-3");
        piring.push("Piring-4");
        piring.push("Piring-5");
        piring.push("Piring-6");

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t  Selamat datang di cafe Indonesia");
        System.out.println("\t\t=======================================================================================");
        
        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t     PILIH MENU PERINTAH  ");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t1. Masuk Antrian");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t2. Pesan Minuman ");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t3. Pesan Mie ");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t4. Pesanan Siap ");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t5. Lihat data Pelanggan");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t6. Cek piring");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t7. Hapus Data Pelanggan");
            System.out.println("\t\t\t\t------------------------------");
            System.out.println("\t\t\t\t8. Keluar");
            System.out.println("\t\t\t\t==============================");
            System.out.print("\t\t\t\t     Pilihan Anda : ");
            menu=input.nextInt();
            System.out.println("\n");
            if(menu==1){
                System.out.println("\t\t\t\t==============================");
                System.out.print("\t\t\t\tMasukan nama      : ");
                nama = str.nextLine();
                name.add(nama);
                if(nama==""){
                    System.out.println("\t\t\t\tNama Masih Kosong!!");
                    
                }else{
                    System.out.println("\t\t\t\tNama Tersimpan!!");
                }

                
                
                

            }else if(menu==2){
                System.out.println("\t\t\t\t----------------------");
                System.out.println("\t\t\t\t||**PESANAN PELANGGAN**||");
                System.out.println("\t\t\t\t----------------------");
                System.out.println("\t\t\t\t| 1.BOBA");
                System.out.println("\t\t\t\t| 2.CAPPUCINO");
                System.out.println("\t\t\t\t| 3.GREEN TEA");
                System.out.println("\t\t\t\t| 4.LATTE");
                System.out.println("\t\t\t\t| 5.LEMON TEA");
                System.out.println("\t\t\t\t| 6.MOCCA");
                System.out.println("\t\t\t\t----------------------");
                System.out.print("\t\t\t\tPILIH MENU : ");
                Pesanan = iPesan.nextInt();
                    if(Pesanan==1){
                    pesan.add(arrPesanan[0]);
                }else if(Pesanan==2){
                    pesan.add(arrPesanan[1]);
                }else if(Pesanan==3){
                    pesan.add(arrPesanan[2]);
                }else if(Pesanan==4){
                    pesan.add(arrPesanan[3]);
                }else if(Pesanan==5){
                    pesan.add(arrPesanan[4]);
                }else if(Pesanan==6){
                    pesan.add(arrPesanan[5]);
                }else{
                    System.out.println("\t\t\t\tTidak Tersedia!!");
                }

                
                
            }else if(menu==3){
                System.out.println("\t\t\t\t==============================");
                System.out.println("\t\t\t\t\t  PILIH MENU MIE  ");
                System.out.println("\t\t\t\t==============================");
                System.out.println("\t\t\t\t1. "+mie[0]);
                System.out.println("\t\t\t\t2. "+mie[1]);
                System.out.println("\t\t\t\t3. "+mie[2]);
                System.out.println("\t\t\t\t4. "+mie[3]);
                System.out.println("\t\t\t\t==============================");
                System.out.print("\t\t\t\tPILIH MENU : ");
                inputMie = InMie.nextInt();
                if(inputMie==1){
                    pesanMie.add(mie[0]);
                    
                }else if(inputMie==2){
                    pesanMie.add(mie[1]);
                    
                }else if(inputMie==3){
                    pesanMie.add(mie[2]);
                    
                }else if(inputMie==4){
                    pesanMie.add(mie[3]);
                    
                }else{
                    System.out.println("\t\t\t\tTidak Tersedia!!");
                }
                //STACK_POP
                piring.pop();
                System.out.println("\t\t\t\tPESANAN TERSIMPAN!!");
                

                
                

            }else if(menu==4){
                if(name.isEmpty()){
                    System.out.println("\t\t\t\tCEK KEMBALI PELANGGAN ANDA!!");
                }else{
                System.out.println("\t\t\t\tNOTICE!!");
                System.out.println("\t\t\t\tPemanggilan atas nama : "+name.poll());
                pesan.poll();
                pesanMie.poll();
                }

                
            }else if(menu==5){
                if(name.isEmpty()){
                    System.out.println("\t\t\t\tTIDAK ADA PELANGGAN!!");
                }else{
                    
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t        DATA PELANGGAN");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| NAMA       : "+name);
                    System.out.println("\t\t\t\t------------------------------");
                    System.out.println("\t\t\t\t|| MINUMAN    : "+pesan);
                    System.out.println("\t\t\t\t------------------------------");
                    System.out.println("\t\t\t\t|| MIE        : "+pesanMie);
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| PELANGGAN PERTAMA  : "+name.peek());
                    System.out.println("\t\t\t\t|| TOTAL PELANGGAN    : "+name.size());

                }

                

                
                
            }else if(menu==6){
                System.out.println("\t\t\t\t1.Lihat Jumlah Piring ");
                System.out.println("\t\t\t\t2.Tambah Tumpukan Piring ");
                System.out.println("\t\t\t\t----------------------");
                System.out.print("\t\t\t\tPILIH  : ");
                CekP = Pcek.nextInt();
                if(CekP==1){
                    System.out.println("\t\t\t\t"+piring);
                }else if(CekP==2){
                    System.out.print("\t\t\t\tMasukan piring & No urut : ");
                    PMie = PushMie.nextLine();
                    piring.push(PMie);
                if(piring.isEmpty()){   
                    System.out.println("\t\t\t\tDATA MASIH KOSONG!!");
                }else{
                    System.out.println("\t\t\t\tDATA BERHASIL DITAMBAH!!");
                }
                }

                
            }else if(menu==7){
                if(pesan.isEmpty()&&name.isEmpty()){
                    System.out.println("\t\t\t\tDATA KOSONG!!");
                }else{
                System.out.print("\t\t\t\tMasukan NAMA Pelanggan : ");
                hapusNama = rmvN.nextLine();
                System.out.print("\t\t\t\tMasukan Nama Minuman   : ");
                hapusPesanan = rmvK.nextLine();
                System.out.print("\t\t\t\tMasukan Nama Makanan   : ");
                hapusMie = rmvMie.nextLine();
                System.out.print("\n");

                    if(name.contains(hapusNama)&&pesan.contains(hapusPesanan)&&pesanMie.contains(hapusMie)==false){
                        System.out.println("\t\t\t\tDATA TIDAK SESUAI!!");
                    }else if(name.remove(hapusNama)&&pesan.remove(hapusPesanan)&&pesanMie.remove(hapusMie)){
                        System.out.println("\t\t\t\tDATA BERHASIL DIHAPUS!! ");
                    }
                }
            }else{
                if(menu==8){
                    System.out.println("\n\t\t\t\t\t *Terima Kasih*");
                }
            }
        }while(menu!=8);
    }
}
