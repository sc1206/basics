package Test;

import java.util.Scanner;

public class chengji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评级分数");
        double score = sc.nextDouble();
        String grade;
        /*用三元运算一行搞定代码清晰*/
        grade = score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "不及格，重考"));
  /*      if (score>=90){
            grade="A";
        }else if (score>=80){
            grade="B";
        }else if (score>=70){
            grade="C";
        }else {
            grade="不及格，重考";
        }*/
        System.out.println("分数为" + score + "，级别为" + grade);
    }
}
