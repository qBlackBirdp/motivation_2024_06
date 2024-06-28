package com.koreait;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation execution ==");

        int lastId = 0;

//        Motivation motivation0 = null;
//        Motivation motivation1 = null;
//        Motivation motivation2 = null;

//        Motivation[] motivations = new Motivation[3];

        List<Motivation> motivations = new ArrayList<>();

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
                int id = lastId + 1;

                System.out.print("motivation :");
                String body = sc.nextLine();
                System.out.print("source :");
                String source = sc.nextLine();

                Motivation motivation = new Motivation(id,body,source);

                motivations.add(motivation);

//                motivations[id - 1] = motivation;

//                if (motivation.id == 1) {
//                    motivation0 = motivation;
//                }else if (motivation.id == 2) {
//                    motivation0 = motivation;
//                }else if (motivation.id == 3) {
//                    motivation1 = motivation;
//                }

                System.out.printf("%d번 motivation 이 등록 되었습니다.\n", id);
                lastId++;
            } else if(cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.printf("  id   //    motivation      //      source       \n");
                System.out.println("=".repeat(40));
//            for(Motivation motivation : motivations) {
//                System.out.println(motivation.toString());
//            }
            if (motivations.size() == 0) {
                System.out.println("등록된 motivation 없음.");
            } else {
                System.out.println("있음.");
                System.out.println("등록된 motivation 개수 : " + motivations.size());
            }
            }
        }

    }
}

class Motivation {
    int id;
    String body;
    String source;

    public Motivation(int id, String body, String source) {
        this.id = id;
        this.body = body;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}