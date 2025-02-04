package Features;

import Features.Management.*;
import java.util.Scanner;

public class UI {
    static Checker check = new Checker();
    Scanner input = new Scanner(System.in);
    public static void initUI() {
        var menu = new UI();
        menu.initMainMenu();
    }


    private void initMainMenu() {
        while (true) {
            System.out.println("1. Menu Mahasiswa");
            System.out.println("2. Menu Buku");
            System.out.println("3. Exit Program");
            System.out.print("Pilihan: ");

            String choice = input.nextLine();
            if (!check.isNumber(choice)) {
                System.out.println("Harus berupa angka dan tidak boleh kosong!");
                continue;
            }

            switch (Integer.parseInt(choice)) {
                case 1 -> studentMenu();
                case 2 -> bookMenu();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Pilihan yang dimasukan salah!");
            }
        }
    }

    private void studentMenu() {
        while (true) {
            System.out.println("1. Register Mahasiswa");
            System.out.println("2. Check Data Mahasiswa");
            System.out.println("3. Kembali");
            System.out.print("Pilihan: ");

            String choice = input.nextLine();
            if (!check.isNumber(choice)) {
                System.out.println("Harus berupa angka dan tidak boleh kosong!");
                continue;
            }

            switch (Integer.parseInt(choice)) {
                case 1 -> Form.initRegister();
                case 2 -> Form.initChecker();
                case 3 -> {
                    return;
                }
                default -> System.out.println("Pilihan yang dimasukan salah!");
            }
        }
    }

    private void bookMenu() {
        while (true) {
            System.out.println("1. Donasi Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Kembali");
            System.out.print("Pilihan: ");

            String choice = input.nextLine();
            if (!check.isNumber(choice)) {
                System.out.println("Harus berupa angka dan tidak boleh kosong!");
                continue;
            }
            switch (Integer.parseInt(choice)) {
                case 1 -> Book.initDonation();
                case 2 -> Book.initBorrow();
                case 3 -> Book.initSearch();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Pilihan yang dimasukan salah!");
            }
        }
    }
}
