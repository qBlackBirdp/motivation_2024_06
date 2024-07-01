package org.koreait;

import org.koreait.system.Container;

public class Main {
    public static void main(String[] args) {

        Container.init();

        new App().run();

        Container.close();
    }
}