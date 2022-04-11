package sistem_parkir;

import java.util.Scanner;

public class responsi {

    static int hg[] = { 20000, 10000, 5000, 15000, 7000, 4000, 10000,
            5000, 2000 };
    static String kd[] = { "Mobil", "Motor", "Sepeda" };
    static int admin[] = { 500 };
    static int jum, total, tempat;

    static void parkirTempat1() {
        System.out.print("\033[H\033[2J");
        int harga, mp;
        Scanner input = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println(" |-------------------------------|");
        System.out.println(" |        Tempat Parkir A        |");
        System.out.println(" |-------------------------------|");
        System.out.println(" |  Kendaraan   |  Harga Parkir  |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 1. Mobil     |   Rp. 20.000   |");
        System.out.println(" | 2. Motor     |   Rp. 10.000   |");
        System.out.println(" | 3. Sepeda    |   Rp. 5.000    |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 4. Kembali ke menu utama      |");
        System.out.println(" |-------------------------------|");
        System.out.print(" Silahkan Pilih Kendaraan [1/2/3/4] : ");
        harga = input.nextInt();
        switch (harga) {
            case 1:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan Total Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm1();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat1();
                }
                break;
            case 2:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm2();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat1();
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm3();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat1();
                }
                break;
            case 4:
                Menu();
            default:
                System.out.println(" Mohon maaf Data yang Anda masukkan tidak tersedia!!");
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat1();
                }
        }
        input.close();
        n.close();
    }

    static void parkirTempat2() {
        System.out.print("\033[H\033[2J");
        int harga, mp;
        Scanner input = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println(" |-------------------------------|");
        System.out.println(" |        Tempat Parkir B        |");
        System.out.println(" |-------------------------------|");
        System.out.println(" |  Kendaraan   |  Harga Parkir  |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 1. Mobil     |   Rp. 15.000   |");
        System.out.println(" | 2. Motor     |   Rp. 7.000    |");
        System.out.println(" | 3. Sepeda    |   Rp. 4.000    |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 4. Kembali ke menu utama      |");
        System.out.println(" |-------------------------------|");
        System.out.print(" Silahkan Pilih Kendaraan [1/2/3/4] : ");
        harga = input.nextInt();
        switch (harga) {
            case 1:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan Total Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm1();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat2();
                }
                break;
            case 2:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm2();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat2();
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm3();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat2();
                }
                break;
            case 4:
                Menu();
            default:
                System.out.println(" Mohon maaf Data yang Anda masukkan tidak tersedia!!");
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat2();
                }
        }
        input.close();
        n.close();
    }

    static void parkirTempat3() {
        System.out.print("\033[H\033[2J");
        int harga, mp;
        Scanner input = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println(" |-------------------------------|");
        System.out.println(" |        Tempat Parkir C        |");
        System.out.println(" |-------------------------------|");
        System.out.println(" |  Kendaraan   |  Harga Parkir  |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 1. Mobil     |   Rp. 10.000   |");
        System.out.println(" | 2. Motor     |   Rp. 5.000    |");
        System.out.println(" | 3. Sepeda    |   Rp. 2.000    |");
        System.out.println(" |-------------------------------|");
        System.out.println(" | 4. Kembali ke menu utama      |");
        System.out.println(" |-------------------------------|");
        System.out.print(" Silahkan Pilih Kendaraan [1/2/3/4] : ");
        harga = input.nextInt();
        switch (harga) {
            case 1:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Berapa Total Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm1();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat3();
                }
                break;
            case 2:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm2();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat3();
                }
                break;
            case 3:
                System.out.println("-------------------------------------------------------");
                System.out.print(" Masukkan jumlah Kendaraan yang ingin Anda parkir : ");
                jum = n.nextInt();
                totalm3();
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat3();
                }
                break;
            case 4:
                Menu();
            default:
                System.out.println(" Mohon maaf Data yang Anda masukkan tidak tersedia!!");
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = input.nextInt();
                if (mp == 1) {
                    parkirTempat3();
                }
        }
        input.close();
        n.close();
    }

    public static void totalm1() {
        int pil = tempat;
        int c = admin[0];
        if (pil == 1) {
            int a = jum, b = hg[0];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[0]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else if (pil == 2) {
            int a = jum, b = hg[3];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[0]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else {
            int a = jum, b = hg[6];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[0]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        }
    }

    public static void totalm2() {
        int c = admin[0];
        int pil = tempat;
        if (pil == 1) {
            int a = jum, b = hg[1];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[1]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else if (pil == 2) {
            int a = jum, b = hg[4];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[1]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else {
            int a = jum, b = hg[7];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[1]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        }
    }

    public static void totalm3() {
        int pil = tempat;
        int c = admin[0];
        if (pil == 1) {
            int a = jum, b = hg[2];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[2]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else if (pil == 2) {
            int a = jum, b = hg[5];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[2]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        } else {
            int a = jum, b = hg[8];
            total = a * b + c;
            System.out.print("\033[H\033[2J");
            System.out.println("-------------------------------------------------------");
            System.out.println("            Struk Pembayaran Tempat parkir             ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" Nama Kendaraan   : " + kd[2]);
            System.out.println(" Jumlah kendaraan : " + jum);
            System.out.println(" Biaya Parkir     : Rp." + b + "/Kendaraan");
            System.out.println(" Admin            : Rp." + admin[0]);
            System.out.println("-------------------------------------------------------");
            System.out.println(" Total biaya yang harus di bayar : Rp." + total);
            System.out.println("-------------------------------------------------------");
        }
    }

    public static void Menu() {
        System.out.print("\033[H\033[2J");
        Scanner isi = new Scanner(System.in);
        int mp;
        System.out.println(" -------------------------------------------");
        System.out.println(" |               Menu Parkir               |");
        System.out.println(" -------------------------------------------");
        System.out.println(" |   1. Tempat Parkir A                    |");
        System.out.println(" |   2. Tempat Parkir B                    |");
        System.out.println(" |   3. Tempat Parkir C                    |");
        System.out.println(" |   4. Keluar                             |");
        System.out.println("--------------------------------------------");
        System.out.print(" Silahkan Pilih Tempat Parkir [1/2/3/4] : ");
        tempat = isi.nextInt();
        switch (tempat) {
            case 1:
                parkirTempat1();
                break;
            case 2:
                parkirTempat2();
                break;
            case 3:
                parkirTempat3();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.print("\033[H\033[2J");
                System.out.println(" Mohon maaf Menu yang Anda masukkan tidak tersedia!!");
                System.out.print(" Kembali ke menu tekan '1' : ");
                mp = isi.nextInt();
                if (mp == 1) {
                    Menu();
                }
        }
        isi.close();
    }

    public static void main(String[] args) {
        Menu();
    }
}
