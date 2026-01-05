public class Utils {

    public static int max(int a,int b){
        if (a > b){
        return a;
        }
        return b;
    }

    public static int min(int a, int b){
        if (a < b){
            return a;
        }
        return b;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        return num * fact(num-1);
    }

    public static String TrimAndUpperCase(String s){
        if (s != null){
            return s.trim().toUpperCase();
        }else {
            return " ";
        }
    }

}
