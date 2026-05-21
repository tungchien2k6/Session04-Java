package exercise03;

import java.util.Scanner;

public class SearchAndSortArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }

        selectionSortDescending(mang);
        System.out.println("\nMảng sau khi sắp xếp giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }

        System.out.print("\n\nNhập số cần tìm: ");
        int x = sc.nextInt();
        int viTriTuyenTinh = linearSearch(mang, x);
        System.out.print("Tìm kiếm tuyến tính: ");
        if (viTriTuyenTinh != -1) {
            System.out.println("Số " + x + " có tại vị trí " + (viTriTuyenTinh + 1));
        } else {
            System.out.println("Không tìm thấy số " + x);
        }

        int viTriNhiPhan = binarySearchDescending(mang, x);
        System.out.print("Tìm kiếm nhị phân: ");
        if (viTriNhiPhan != -1) {
            System.out.println("Số " + x + " có tại vị trí " + (viTriNhiPhan + 1));
        } else {
            System.out.println("Không tìm thấy số " + x);
        }

        sc.close();
    }

    private static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    private static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearchDescending(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
