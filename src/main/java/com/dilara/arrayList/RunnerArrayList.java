package com.dilara.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RunnerArrayList {
    public static void main(String[] args) {
    /**
     * Ankara
     * Bursa
     * Antalya
     * Artvin
     * Erzurum
     * Karaman
     * Bu sehilrler ile bir liste olusturalım.
     * An ile baslayan sehirleri listeden silen bir method yazalım
     */

        List<String > sehirler=new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Antalya");//"xxx"
        sehirler.add("Bursa");
        sehirler.add("Artvin");
        sehirler.add("Erzurum");
        sehirler.add("Karaman");

        List<String> sehirler2=new ArrayList<>(List.of("İzmir","Konya","Balıkesir" ));
        anIleBaslayanSehirleriGuncelle2(sehirler2);
        sehirler.addAll(sehirler2);
        //  sehirler.removeAll(sehirler2);
        //sehirler listesinde baskent varmı
        if (sehirler.contains("Ankara")){
            System.out.println("Başkent bu listede vardır.");
        }
        System.out.println(sehirler.containsAll(sehirler2));

        // System.out.println(sehirler);


        sehirler.forEach(System.out::println);
        System.out.println("/////////////////////////////");
        sehirler.subList(0,3).forEach(System.out::println);
        System.out.println("/////////////////////////////");
        sehirler.subList(3,sehirler.size()).forEach(System.out::println);

    }
    public static void anIleBaslayanSehirleriSil(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.remove(i);
                i--;
            }
        }
    }
    public static void anIleBaslayanSehirleriGuncelle(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.set(i,"xxx");
            }
        }
    }
    public static void anIleBaslayanSehirleriGuncelle2(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.remove(i);
                sehirler.add(i,"xxx");
            }
        }
    }
    // forEach asenkron yapıda çalıştığı için silme ve ekleme işlemleri foreach uzerinden yapılamaz!!!
    //public static void anİleBaslayanSehirleriSil2(List<String> sehirler) {
    //   for ( String sehir :sehirler) {
    //      if (sehir.startsWith("An")){
    //           sehirler.remove(sehir);
    //         }
    //     }
    // }
}
