package com.dilara.stack;

import java.util.Stack;

public class RunnerStack {
    public static void main(String[] args) {
        /**
         * Bir stack oluşturacağız, içine 6-7 tane değer ekleyeceğiz.
         * 100 TL'den büyükleri başka bir stack yapısında toplayacağız.
         * 100 TL'den küçük değerlerin ise toplamını bulup yazdıralım.
         */

        Stack<Integer> sayilarStack = new Stack<>();
        sayilarStack.push(10);
        sayilarStack.push(20);
        sayilarStack.push(30);
        sayilarStack.push(500);
        sayilarStack.push(900);
        sayilarStack.push(589);

        Stack<Integer> buyukSayiStack = new Stack<>();
        int toplam = 0;
        for (Integer para : sayilarStack){
            if (para>100){
                buyukSayiStack.push(para);
            }else{
                toplam +=para;
            }
        }
        System.out.println(toplam);
        System.out.println(buyukSayiStack);

        while(!sayilarStack.isEmpty()){
            //stack boşalana kadar while çalışacak (stack değerler üstten alta doğru çıkıyor)
            if (sayilarStack.peek()>100){ //en üstteki değere bakar
                buyukSayiStack.push(sayilarStack.pop());
            }else{
                toplam+= buyukSayiStack.pop();
            }

            System.out.println(toplam);
            System.out.println(buyukSayiStack);

        }

    }
}
