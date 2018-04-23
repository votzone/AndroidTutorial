package wq.tutorial.basic_gramar;

import java.util.Arrays;

/**
 * Created by admin on 2018/4/23.
 */
public class BasicGramar {
    public static int tap_me;

    public static void main(String[ ] args){


        //创建对象，对象名为hello
        BasicGramar hello = new BasicGramar();


        //通过对象名.方法名（）的形式调用方法
        // 无参无返回值
        hello.show();

        // 无参带返回值
        double avg = hello.calcAvg();
        System.out.println("无参带返回值 : " + avg);

        //带参无返回值方法
        hello.calcAvg(94, 81);


        int[] scores={79,52,98,81};
        //调用方法，传入成绩数组，并获取成绩的个数
        // 带参带返回值方法
        int count=hello.sort(scores);
        System.out.println("共有"+count+"个成绩信息！");


        /***
         * 重载
         判断方法重载的依据：
         1、 必须是在同一个类中
         2、 方法名相同
         3、 方法参数的个数、顺序或类型不同
         4、 与方法的修饰符或返回值没有关系

         写一个  getArray(int length) 的重载方法
         */


    }


    //定义 无参无返回值 方法
    public void show( ){
        System.out.println("mooc");
    }


    // 定义一个返回值为double类型的方法
    // 无参带返回值
    public double calcAvg() {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // 计算平均值
        return avg;// 使用return返回值
    }


    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     * 带参无返回值方法
     */
    public void calcAvg(int score1,int score2){
        double avg = (score1+score2)/2;
        System.out.println("带参无返回值方法 : "+avg);
    }


    /*功能：将考试成绩排序并输出，返回成绩的个数定义一个包含整型数组参数的方法，传入成绩数组使用Arrays类对成绩数组进行排序并输出方法执行后返回数组中元素的个数*/
    public int sort(int[] scores){
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        //返回数组中元素的个数
        return scores.length;
    }

    /* 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组*/
    public int[] getArray(int length) {
        // 定义指定长度的整型数组
        int[] nums = new int[length];
        // 循环遍历数组赋值
        for (int i=0;i<length;i++) {
            // 产生一个100以内的随机数，并赋值给数组的每个成员
            nums[i] = (int)(Math.random() * 100);
        }
        return nums; // 返回赋值后的数组
    }
}
