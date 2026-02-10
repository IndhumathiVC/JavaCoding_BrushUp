package Day7;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args){
        int a[] = {100, 200,300,500, 100, 400, 500,100, 600, 700, 100};
        int count = 0, targetNum = 100;
        for(int i=0; i<a.length; i++){
            if(a[i] == targetNum){
                count++;
            }
        }
        System.out.println(count);
    }
}
