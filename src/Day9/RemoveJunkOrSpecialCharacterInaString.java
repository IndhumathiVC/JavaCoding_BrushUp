package Day9;

public class RemoveJunkOrSpecialCharacterInaString {
    public static void main(String [] args) {
        String str = "234!#56789$#$<>?.,cbyjrthgrukjm ADFSGHJYIUYK; !$#@+-!@$.;FDGVBFY4659";
        System.out.println("Before Removing Junk or Special Characters from a String: " + str);
        str = str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println("After Removing Junk or Special Characters from a String: " + str);

    }
}
