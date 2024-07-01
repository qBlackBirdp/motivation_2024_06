package org.koreait;


import org.koreait.motivation.controller.MotivationController;
import org.koreait.system.Container;
import org.koreait.system.controller.SystemController;


public class App {
    byte system_status = 1;

    public App() {

    }

    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();

        while (system_status == 1) {
            System.out.print("commend) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요.");
                continue;
            }

            Rq rq = new Rq(cmd);

            switch (rq.getActionMethod()) {
                case "exit":
                    systemController.exit();
                    system_status = 0;
                    break;
                case "add":
                    motivationController.add();
                    break;
                case "list":
                    motivationController.list();
                    break;
                case "delete":
//                        motivationController.delete();
                    break;
                default:
                    System.out.println("사용할 수 없는 명령어.");
                    break;
            }
        }
    }
}
