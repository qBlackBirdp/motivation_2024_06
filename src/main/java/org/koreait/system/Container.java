package org.koreait.system;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

    // 공유자원을 모아두는 공간 초기화
    public static void init() {
        sc = new Scanner(System.in);
    }

    // 공유 자원을 모아두는 공간 해제
    public static void close() {
        sc.close();
    }

    public static Scanner getScanner() {
        return sc;
    }
}
