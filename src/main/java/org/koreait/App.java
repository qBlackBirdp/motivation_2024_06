package org.koreait;


import org.koreait.motivation.controller.MotivationController;
import org.koreait.system.controller.SystemController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);

        while (true) {
            System.out.print("commend) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요.");
                continue;
            }

            if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            } else if (cmd.startsWith("delete")) {
                //parsing
                String[] cmdBits = cmd.split("\\?", 2);
                String actionMethod = cmdBits[0]; //delete
                Map<String, String> params = new HashMap<>();
                String[] paramBits = cmdBits[1].split("&");

                for (String paramStr : paramBits) {
                    String[] paramStrBits = cmdBits[1].split("=", 2);
                    String key = paramStrBits[0];
                    String value = paramStrBits[1];

                    params.put(key, value);
                }


                motivationController.delete(cmd);
            }
        }

    }
}

