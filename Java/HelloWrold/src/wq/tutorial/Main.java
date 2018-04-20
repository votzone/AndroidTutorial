package wq.tutorial;

public class Main {

    static int add(int x, int y ){
        return x + y;
    }

    static float add(float x, float y){
        return x + y;
    }

    static int max(int a , int b){
        if (a >b){
            return a;
        }else {
            return b;
        }
    }

    static int max(int a, int b, int c){
        return max(max(a,b),c);
    }

    public static void main(String[] args) {
	// hello world
        System.out.println("Hello World");

        // 重载
        int a = 1, b =2;
        float c = 1.0f, d = 2.0f;
        System.out.println(add(a,b));
        System.out.println(add(c,d));
        System.out.println(max(1,2));
        System.out.println(max(1,2,4));


        /** Knowledge point
         *  1 变量 返回值
         *  2 重载 和 调用
         *  3 判断
          */


        //TODO 8种基本类型

    }
}
