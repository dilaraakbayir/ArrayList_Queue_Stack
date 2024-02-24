package com.dilara.kuyruk;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KuyrukOrnek {
    public static void main(String[] args) {
        Queue<Integer> kuyruk1 = new LinkedList<>();
        kuyruk1.add(26);
        kuyruk1.add(38);
        kuyruk1.add(50);
        kuyruk1.add(92);
        kuyruk1.add(11);

        while (!kuyruk1.isEmpty()){
            // System.out.println(kuyruk1.peek());
            System.out.println(kuyruk1.poll());
        }

        Queue<Integer> kuyruk2 = new ArrayBlockingQueue<>(5);
        kuyruk2.offer(68);
        kuyruk2.offer(76);
        kuyruk2.offer(80);
        kuyruk2.offer(90);
        kuyruk2.offer(100);
        System.out.println("/////////////////");
        while (!kuyruk2.isEmpty()){
            System.out.println(kuyruk2.poll());
        }
        Queue<String> kuyruk3 = new PriorityQueue<>();

        kuyruk3.offer("Mustafa");
        kuyruk3.offer("Ayşe");
        kuyruk3.offer("Serkan");
        kuyruk3.offer("Zeliha");
        kuyruk3.offer("Derya");
        System.out.println("//////////");
        while (!kuyruk3.isEmpty()){
            System.out.println(kuyruk3.poll());
        }

        Queue<Integer> kuyruk4 = new PriorityQueue<>();
        kuyruk4.offer(50);
        kuyruk4.offer(10);
        kuyruk4.offer(27);
        kuyruk4.offer(98);
        kuyruk4.offer(86);
        kuyruk4.offer(12);
        System.out.println("/////////");
        while (!kuyruk4.isEmpty()){
            System.out.println(kuyruk4.poll());
        }
    }
}
