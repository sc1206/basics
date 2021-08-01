package com.company.xuexi;

public class swi {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Who are you looking for?");
//        int option = sc.nextInt();
//        switch (option) {
//            case 1:
//                System.out.println("wen");
//                break;
//            case 2:
//                System.out.println("shen");
//                break;
//            case 3:
//                System.out.println("Sorry, no");
//                break;
//
//            default:
//                System.out.println("sorry");
//                break;
//        }
//        int sum = 0;
//        int n = 1;
//        if (n > 0) {
//            sum = sum + n;
//            n++;
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//        System.out.println(n);
        int[] ns = {1, 4, 9, 16, 25};
        int sum = 0;
        for (int i = 0; i < ns.length; i++) {
            System.out.println("i=" + i + ",ns[i]=" + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum=" + sum);



    }
}
