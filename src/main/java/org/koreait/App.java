package org.koreait;


import org.koreait.motivation.controller.MotivationController;
import org.koreait.system.Container;
import org.koreait.system.controller.SystemController;



public class App {


    public App() {

    }

    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();

        while (true) {
            System.out.print("commend) ");
            String cmd = Container.getScanner().nextLine().trim();

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

                Rq rq = new Rq(cmd);

//                motivationController.delete(cmd);

            } else {
                System.out.println("사용할 수 없는 명령어입니다");
            }

        }
    }
}
