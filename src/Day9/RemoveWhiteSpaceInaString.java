package Day9;

public class RemoveWhiteSpaceInaString {
    public static void main(String [] args){
        String str = "We l c o m e";
        System.out.println("Before Removing whiteSpace from a String: " +str);
        str = str.replaceAll("\\s", "");
        System.out.println("After Removing whiteSpace from a String: " +str);
    }
}
