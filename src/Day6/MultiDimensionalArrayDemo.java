package Day6;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args){
        // Declare an array
        // Add values into an array
        // Find the size or length of an array
        // read the single value from an array
        // read the multiple value from an array

        //Declare an array
        /* int a[][] = new int[3][2];
        // Add values into an array
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;
        System.out.println(a[2][1]);
         */

        //Find the size or length of an array
        /* int a[][] = {{100,200},
                     {300,400},
                     {500,600}};
        System.out.println("Rows Length of Array: "  +a.length);
        System.out.println("Columns Length of Array: "  +a[0].length);
         */

        //read Single value from an Array
        /* int a[][] = {{100,200},
                {300,400},
                {500,600}};
        System.out.println(a[2][1]);
         */

        // read multiple value from an Array
        /* int a[][] = {{100,200}, {300,400}, {500,600}};
        for(int r = 0; r<a.length; r++){
            for(int c = 0; c <a[0].length; c++){
                System.out.print(a[r][c]+ "     ");
            }
            System.out.print("\n");
        }
         */

        // read multiple value from an Array for-each loop
        int a[][] = {{500,600}, {700,800}, {900,200}};
        for(int arr[]: a){
            for(int x: arr){
                System.out.print(x+ "     ");
            }
            System.out.print("\n");
        }

    }
}
