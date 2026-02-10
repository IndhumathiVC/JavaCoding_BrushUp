package Day2;

public class MultipleVariablesDemo {
    public static void main(String [] args){
        //Declaring Many/Multiple Variables in Java
        //Approach 1:If all the variables are belongs to different dataType
        int a = 100;
        int b = 200;
        int c = 200;
        System.out.println(a+b+c);

        //Approach 2: If all the variables are belongs to same dataType then we can prefer this approach
        int x, y, z;
        x = 100;
        y = 200;
        z = 200;
        System.out.println(x+y+z);

        //Approach 3: If all the variables are belongs to same dataType
        int p = 100, q=200, r=200;

        System.out.println("The value of a is:"+p);
        System.out.println("The value of a is:"+q);
        System.out.println("The value of a is:"+r);
        System.out.println(p+" "+q+" "+r);
        System.out.println(p+q+r);
    }
}
