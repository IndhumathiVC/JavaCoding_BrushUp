package JavaPracticePrograms;

public class RemoveJunkFilesOrSpecialCharacterInACharacter {
    public static void main(String [] args){
        String s = "PDUYHHJN ghdgjdyu !$&%*#((^TwlVJJVJKLRG$#^ }{{:?>>!@#$^^*%(**()(*^&_+}{-]'-l";
        System.out.println("Before removing Junk: " +s);

        s= s.replaceAll("[^a-zA-Z0-9]","");

        System.out.println("After removing Junk: " +s);
    }
}
