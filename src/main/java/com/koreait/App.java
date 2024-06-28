package com.koreait;

import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation execution ==");

        int lastId = 1;

        while (true) {
            System.out.print("commend) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation end ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요.");
                continue;
            }


            if (cmd.equals("add")) {
                System.out.print("motivation :");
                String motivation = sc.nextLine();
                System.out.print("source :");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation 이 등록 되었습니다.\n", lastId);
            }
        }

    }
}
