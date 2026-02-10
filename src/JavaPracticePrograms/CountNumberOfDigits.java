package JavaPracticePrograms;

public class CountNumberOfDigits {
    public static void main(String [] args){
    int num = 987654321;
    int count = 0;
    while(num!=0){
        num = num/10;
        count++;
    }
    System.out.println("CountNumber of Digits from GivenNumber: " + count);
    }
}
