package org.example;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //region[Generic]
        GenericClass<String> stringGenericClass=new GenericClass<>();
        stringGenericClass.setContent("Generic Class");
        System.out.println(stringGenericClass.getContent());
        GenericClass<Integer> integerGenericClass=new GenericClass<>();
        integerGenericClass.setContent(2356);
        System.out.println(integerGenericClass.getContent());
        //endregion

        //region[Find Item]
        List<String> kullaniciAdi= Arrays.asList("ozent","ozentastan","otastan");
        List<Integer> password=Arrays.asList(1234,5697,1236);

        System.out.println(FindItem.strFindItem(kullaniciAdi,"ozentastan"));
        //System.out.println(FindItem.findItem(kullaniciAdi,"xxx"));
        System.out.println(FindItem.intFindItem(password,1234));
        //System.out.println(FindItem.findItem(password,6));
        //endregion
    }
}