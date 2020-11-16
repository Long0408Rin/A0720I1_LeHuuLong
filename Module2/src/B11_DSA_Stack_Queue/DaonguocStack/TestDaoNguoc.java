package B11_DSA_Stack_Queue.DaonguocStack;

import java.util.Scanner;

public class TestDaoNguoc {
    public static void main(String[] args){

        System.out.println("Nhan 1 hoac 2 de chon:" +
                "\n 1. Dao Chuoi" +
                "\n 2. Dao So");
        Scanner sc = new Scanner(System.in);
        int Chon = sc.nextInt();
        switch (Chon){
            case 1:
           DaoChuoi.daoChuoi();
                break;
            case 2:
                DaoSo.daoSo();
                break;
            default:
                System.out.println("Moi nhap lai");
        }
    }
}
