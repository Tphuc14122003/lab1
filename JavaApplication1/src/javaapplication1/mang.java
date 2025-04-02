/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Thien_Phuc
 */
public class mang {

    public static void main(String[] args) {

        // bài 1 : 
//        Cho n số nguyên
//a. Tìm vị trí và giá trị phần tử lớn nhất của dãy.
//b. Tìm vị trí và giá trị phần tử nhỏ nhất của dãy.
//c. Tính tổng các phần tử của dãy.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//
//        int[] b = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập số phần tử " + (i + 1) + "");
//            b[i] = sc.nextInt();
//        }
//        System.out.println("Chọn câu hỏi muốn trả lời");
//        System.out.println("1. Tìm vị trí và giá trị phần tử lớn nhất của dãy.");
//        System.out.println("2. Tìm vị trí và giá trị phần tử nhỏ nhất của dãy.");
//        System.out.println("3. Tính tổng các phần tử của dãy.");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                int max = b[0];
//                int maxIndex = 0;
//                for (int i = 1; i < n; i++) {
//                    if (b[i] > max) {
//                        max = b[i];
//                        maxIndex = i;
//                    }
//                }
//                System.out.println("giá trị phần tử lớn nhất của dãy là " + max + "tại vị trí" + maxIndex);
//                break;
//            case 2:
//                int min = b[0];
//                int minIndex = 0;
//                for (int i = 1; i < n; i++) {
//                    if (b[i] < min) {
//                        min = b[i];
//                        minIndex = i;
//                    }
//                }
//                System.out.println("giá trị phần tử nhỏ nhất của dãy là " + min + "tại vị trí" + minIndex);
//                break;
//            case 3:
//                int tong = 0;
//                for (int i = 0; i < n; i++) {
//                    tong += b[i];
//                }
//                System.out.println("tổng các phần tử của dãy là : " + tong);
//                break;
//            default:
//                System.out.println("Vui long chon 1 trong 3 (1-3)");
//                break;
//        }
// bài 2 : Cho n số nguyên. Tìm xem phần tử lớn nhất xuất hiện trong dãy mấy lần.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        int max = b[0];
//        for (int i = 1; i < n; i++) {
//            if (b[i] > max) {
//                max = b[i];
//            }
//        }
//        int countMax = 0;
//        for (int i = 0; i < n; i++) {
//            if (b[i] == max) {
//                countMax++;
//            }
//        }
//        System.out.println(" phần tử lớn nhất xuất hiện " + countMax + "lần trong dãy");
//Bài 3. Nhập vào n số nguyên
//
//a. Đếm số phần âm, dương, bằng 0 của dãy.
//b. Xác định số âm lớn nhất và số dương nhỏ nhất.
//c. Cho biết | tổng âm| có bằng tổng dương không.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thứ:" + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        System.out.println("Chọn câu hỏi");
//        System.out.println("a. Đếm số phần âm, dương, bằng 0 của dãy");
//        System.out.println("b. Xác định số âm lớn nhất và số dương nhỏ nhất");
//        System.out.println("c. Cho biết | tổng âm| có bằng tổng dương không");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                int am = 0;
//                int duong = 0;
//                int zero = 0;
//                for (int i = 0; i < n; i++) {
//                    if (b[i] < 0) {
//                        am++;
//                    } else if (b[i] > 0) {
//                        duong++;
//                    } else {
//                        zero++;
//                    }
//                }
//                System.out.println("Số phần âm" + am);
//                System.out.println("Số phần duong" + duong);
//                System.out.println("Số phần zero" + zero);
//                break;
//            case 2:
//                int am_max = Integer.MIN_VALUE;
//                int duong_min = Integer.MAX_VALUE;
//
//                for (int i = 0; i < n; i++) {
//                    if (b[i] < 0 && b[i] > am_max) {
//                        am_max = b[i];
//                    }
//                    if (b[i] > 0 && b[i] < duong_min) {
//                        duong_min = b[i];
//                    }
//                }
//
//                if (am_max == Integer.MIN_VALUE) {
//                    System.out.println("Không có số âm trong mảng.");
//                } else {
//                    System.out.println("Số âm lớn nhất là: " + am_max);
//                }
//
//                if (duong_min == Integer.MAX_VALUE) {
//                    System.out.println("Không có số dương trong mảng.");
//                } else {
//                    System.out.println("Số dương nhỏ nhất là: " + duong_min);
//                }
//                break;
//            case 3:
//                int tong_am = 0;
//                int tong_dương = 0;
//                for (int i = 0; i < n; i++) {
//                    if (b[i] < 0) {
//                        tong_am += b[i];
//                    } else if (b[i] > 0) {
//                        tong_dương += b[i];
//                    }
//                }
//                if (Math.abs(tong_am) == tong_dương) {
//                    System.out.println("Tổng âm bằng tổng dương");
//                } else {
//                    System.out.println("Tổng âm không bằng tổng dương");
//                }
//                break;
//            default:
//                System.out.println("VUi lòng chọn a,b,c");
//                break;
//        }
//      Bài 4. Cho n số. Đảo thứ tự của dãy theo nguyên tắc sau: A[1] đổi cho với A[n], A[2] đổi cho với A[n-1], ...
//In kết quả ra màn hình.
//Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thử" + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        
//        for( int i =0; i<n/2; i++) {
//            int temp = b[i];
//            b[i] = b[n -1 -i];
//            b[n-1-i] = temp;
//            
//        }
//        System.out.println("dãy sau khi đổi thứ tự là : ");
//        for(int i =0 ; i <n ; i++) {
//            System.out.print(b[i]+"");
//        }
//        System.out.println();
//    Bài 5. Cho n số và số x.
//a. Xác định xem số x có xuất hiện trong dãy không?
//b. Cho biết số x xuất hiện trong dãy bao nhiêu lần và tại các vị trí nào?
//c. Loại bỏ khỏi dãy tất cả các phần tử bằng x. In cả 2 dãy ra màn hình.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int[] b = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thử" + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        System.out.println("Nhập số x");
//        int x = sc.nextInt();
//        System.out.println("Chọn câu hỏi muốn trả lời:");
//        System.out.println("1. Xác định xem số x có xuất hiện trong dãy không?");
//        System.out.println("2. Cho biết số x xuất hiện trong dãy bao nhiêu lần và tại các vị trí nào?");
//        System.out.println("3. Loại bỏ khỏi dãy tất cả các phần tử bằng x. In cả 2 dãy ra màn hình.");
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                boolean found = false;
//                for (int i = 0; i < n; i++) {
//                    if (b[i] == x) {
//                        found = true;
//                        break;
//                    }
//                }
//                if (found) {
//                    System.out.println("Số" + x + "có xuất hiện trong dãy");
//                } else {
//                    System.out.println("Số" + x + "không có xuất hiện trong dãy");
//                }
//                break;
//            case 2:
//                int countX = 0;
//                System.out.println("Số" + x + " xuất hiện tại các vị trí: ");
//                for (int i = 0; i < n; i++) {
//                    if (b[i] == x) {
//                        System.out.print(i + " ");
//                        countX++;
//                    }
//                }
//                if (countX == 0) {
//                    System.out.println("Số " + x + " không xuất hiện trong dãy.");
//
//                } else {
//                    System.out.println("Số " + x + " xuất hiện " + countX + " lần trong dãy.");
//                }
//                break;
//            case 3:
//                int[] newArray = new int[n];
//                int newSize = 0;
//                for (int i = 0; i < n; i++) {
//                    if (b[i] != x) {
//                        newArray[newSize++] = b[i];
//                    }
//                }
//                System.out.println("Dãy ban đầu:");
//                for (int i = 0; i < n; i++) {
//                    System.out.print(b[i] + " ");
//                }
//                System.out.println();
//                System.out.println("Dãy sau khi loại bỏ khỏi dãy tất cả các phần tử bằng " + x + ":");
//                for (int i = 0; i < newSize; i++) {
//                    System.out.print(newArray[i] + " ");
//                }
//                System.out.println();
//                break;
//            default:
//                System.out.println("Vui lòng chọn từ 1-3");
//                break;
//        }
//          Bài 6. Cho một dãy gồm n số.
//a. Kiểm tra xem dãy có tăng dần hay không.
//b. Sắp xếp dãy theo thứ tự tăng dần. In dãy kết quả ra màn hình.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int b[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thử" + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        System.out.println(" Chọn câu hỏi muốn trả lời:");
//        System.out.println("1. Kiểm tra xem dãy có tăng dần hay không");
//        System.out.println("2. Sắp xếp dãy theo thứ tự tăng dần. In dãy kết quả ra màn hình.");
//
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                boolean inIncreasing = true;
//                for (int i = 0; i < n - 1; i++) {
//                    if (b[i] > b[i + 1]) {
//                        inIncreasing = false;
//                        break;
//                    }
//                }
//                if (inIncreasing) {
//                    System.out.println(" Dãy số nhập là tăng dần");
//                } else {
//                    System.out.println(" Dãy số nhập không phải là tăng dần");
//                }
//                break;
//            case 2:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = i + 1; j < n; j++) {
//                        if (b[i] > b[j]) {
//                            int temp = b[i];
//                            b[i] = b[j];
//                            b[j] = temp;
//                        }
//                    }
//                }
//                System.out.println("Dãy số được sắp xếp theo thứ tự tăng dần : ");
//                for (int i = 0; i < n; i++) {
//                    System.out.print(b[i] + " ");
//                }
//                System.out.println();
//                break;
//            default:
//                System.out.println("Vui lòng chọn từ 1-2");
//                break;
//        }
//          bài 7. Cho một dãy gồm n số.
//a. Kiểm tra xem dãy có đối xứng hay không. Ví dụ dãy sau là đối xứng: 4 2 7 3 7 2 4
//b. Kiểm tra xem dãy có đan dấu hay không. Ví dụ dãy sau là đan dấu: 2 -1 7 -3 4 -5 6 
//Scanner sc = new Scanner(System.in);
//        System.out.println("số phần tử n");
//        int n = sc.nextInt();
//        int b[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thử" + (i + 1) + ":");
//            b[i] = sc.nextInt();
//        }
//        System.out.println(" Chọn câu hỏi muốn trả lời:");
//        System.out.println("1. Kiểm tra xem dãy có tăng dần hay không");
//        System.out.println("2. Sắp xếp dãy theo thứ tự tăng dần. In dãy kết quả ra màn hình.");
// Bài Cho ma trận các số nguyên kích thước m x n:
//a. In ra phần tử lớn nhất và nhỏ nhất của ma trận.
//b. Tính tổng các phần tử của ma trận.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so dong m: ");
//        int m = sc.nextInt();
//        System.out.println("Nhap so cot n: ");
//        int n = sc.nextInt();
//
//        int[][] matrix = new int[m][n];
//
//        System.out.println("Nhap cac phan tu cua ma tran:");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("Nhap phan tu [" + (i + 1) + "][" + (j + 1) + "]: ");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        int max = matrix[0][0];
//        int min = matrix[0][0];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] > max) {
//                    max = matrix[i][j];
//                }
//                if (matrix[i][j] < min) {
//                    min = matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Phan tu lon nhat cua ma tran: " + max);
//        System.out.println("Phan tu nho nhat cua ma tran: " + min);
//
//        int sum = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                sum += matrix[i][j];
//            }
//        }
//        System.out.println("Tong cac phan tu cua ma tran: " + sum);
// bài 9. Cho ma trận vuông A cấp n gồm các số nguyên. Tính tổng từng dòng của ma trận và tìm dòng có tổng lớn nhất.
//Scanner sc = new Scanner(System.in);
// System.out.println("Nhap cap ma tran (n): ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[n][n];
//
//        System.out.println("Nhap cac phan tu cua ma tran:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("Nhap phan tu [" + (i + 1) + "][" + (j + 1) + "]: ");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        int maxSum = Integer.MIN_VALUE;
//        int maxRow = -1;
//
//        for (int i = 0; i < n; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < n; j++) {
//                rowSum += matrix[i][j];
//            }
//            System.out.println("Tong cua dong " + (i + 1) + " la: " + rowSum);
//
//            if (rowSum > maxSum) {
//                maxSum = rowSum;
//                maxRow = i;
//            }
//        }
//
//        System.out.println("Dong co tong lon nhat la dong " + (maxRow + 1) + " voi tong la: " + maxSum);
// bài 10. Cho ma trận vuông cấp n gồm các số nguyên.
//
//a. Kiểm tra ma trận có là ma trận tam giác trên không? (Ma trận tam giác trên thỏa: ít nhất
//một phần tử trên đường chéo chính khác 0, và toàn bộ các phần tử dưới đường chéo chính
//bằng 0).
//b. Kiểm tra ma trận có đối xứng qua đường chéo chính hay không.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cap ma tran (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap phan tu [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isUpperTriangular = true;
        boolean hasNonZeroDiagonal = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }

            if (matrix[i][i] != 0) {
                hasNonZeroDiagonal = true;
            }
        }

        if (isUpperTriangular && hasNonZeroDiagonal) {
            System.out.println("Ma tran la ma tran tam giac tren.");
        } else {
            System.out.println("Ma tran khong phai ma tran tam giac tren.");
        }

        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Ma tran la ma tran doi xung qua duong cheo chinh.");
        } else {
            System.out.println("Ma tran khong phai ma tran doi xung qua duong cheo chinh.");
        }

    }

}
