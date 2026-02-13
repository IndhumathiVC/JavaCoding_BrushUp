package JavaPracticePrograms;

public class MoveAllZerosFromALongNumber {
    public static void main(String [] args){
        long number = 120895005643L;
        String numStr = Long.toString(number);
        StringBuilder result = new StringBuilder();
        int ZerosCount = 0;

        for(int i =0; i<numStr.length(); i++){
            char c = numStr.charAt(i);
            if(c =='0'){
                ZerosCount++;
            }
            else{
                result.append(c);
            }
        }

        for(int i=0; i<ZerosCount; i++){
            result = result.append(0);
        }
        System.out.println("given Long Number: " +number);
        System.out.println("After Moving all Zeros to Last: " +result);
    }
}
