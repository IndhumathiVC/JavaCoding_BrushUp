package Day6;

public class ObjectArrayDemo {
    public static void main(String[] args){
        Object a [] = { 100, 23.7, 'A', "Welcome", true};
        System.out.println(a.length);
        System.out.println(a[3]);
       /* for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        */

        // enhanced for loop or for each loop
        for(Object x : a){
            System.out.println(x);
        }
    }
}
