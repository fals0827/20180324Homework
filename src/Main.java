import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入書名、ISBN、分類、出版社、頁數、價格");
        book bok [] = new book[5];
        for (int i = 0 ; i < 5 ; i ++){
            bok[i] = new book(scn.next(),scn.next(),scn.next(),scn.next(),scn.next(),scn.nextInt());
        }
        int a = 0;
        while (a != 4){
            System.out.println("1. 搜尋書名");
            System.out.println("2. 搜尋ISBN");
            System.out.println("3. 搜尋分類");
            System.out.println("4. 結束使用");
            int n = scn.nextInt();
            switch (n){
                case 1:
                    System.out.println("請輸入書名");
                    String strName = scn.next();
                    for (int j = 0 ; j < 5 ; j ++){
                        if (strName.equals(bok[j].getName())){
                            bok[j].showInfo();
                        }
                    }
                    break;
                case 2:
                    System.out.println("請輸入ISBN");
                    String strISBN = scn.next();
                    for (int k = 0 ; k < 5 ; k ++){
                        if (strISBN.equals(bok[k].getIsbn())){
                            bok[k].showInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("請輸入分類");
                    String strCategory = scn.next();
                    for (int k = 0 ; k < 5 ; k ++){
                        if (strCategory.equals(bok[k].getCategory())){
                            bok[k].showInfo();
                        }
                    }
                    break;
                case 4:
                    a = 4;
            }
        }
        System.out.println("感謝您使用本系統");
    }
}
