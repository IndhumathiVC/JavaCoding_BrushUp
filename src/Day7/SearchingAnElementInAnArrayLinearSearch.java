package Day7;

public class SearchingAnElementInAnArrayLinearSearch {
    public static void main(String[] args){
        int a[] = {200, 300 ,100, 500, 700, 400};
        int SearchElement = 100;
        boolean status = false;
        for(int i=0; i <a.length; i++){
            if(a[i] == SearchElement ){
                System.out.println("Found the Search Element: " +a[i] + " == " +SearchElement );
                status = true;
               break;
            }
        }
        if(status == false) {
            System.out.println("Not Found the Search Element: " + SearchElement);
        }
    }
}
