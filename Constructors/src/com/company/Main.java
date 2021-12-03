package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new User("kkocaman", "kaan.kocaman@arcelik.com.tr");
        System.out.println(user1.getCountry());

        User user2 = new User("turkayurkmez","abc@def.com");
        System.out.println(user2.getEmailAddress());
        System.out.println(user2.getName());
        Scanner scanner = new Scanner(System.in);



    }
}
