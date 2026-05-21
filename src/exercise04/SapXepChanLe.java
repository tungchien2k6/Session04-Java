package exercise04;

import java.util.Scanner;

public class SapXepChanLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Mảng không có phần tử");
            sc.close();
            return;
        }

        int[] mang = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }

        int[] ketQua = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                ketQua[index++] = mang[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0) {
                ketQua[index++] = mang[i];
            }
        }

        System.out.println("\nMảng sau khi sắp xếp (chẵn trước, lẻ sau):");
        for (int i = 0; i < n; i++) {
            System.out.print(ketQua[i] + " ");
        }

        sc.close();
    }
}
