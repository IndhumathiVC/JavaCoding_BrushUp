package JavaPracticePrograms;

import java.util.*;
public class FindOnlyBrandNames {
    public static void main(String [] args){
        String[] phones = {
                "Apple iPhone 15",
                "Samsung Galaxy S24",
                "OnePlus 12",
                "Google Pixel 8",
                "Xiaomi Redmi Note 13",
                "Vivo V29",
                "Oppo Reno 11",
                "Motorola Edge 40"
        };

        ArrayList <String> list = new ArrayList<>();
        for(String brands : phones){
            String brandNames = brands.split(" ")[0];
            list.add(brandNames);
        }
        System.out.println(list);
    }
}
