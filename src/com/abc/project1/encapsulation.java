package com.abc.project1;

/**
 * Created by mroien on 9/20/15.
 */

public class encapsulation {
    public static void main(String arg[]) {
        String packet = "data";
        protocol1(packet);
    }

    public static void protocol1(String data) {
        String data2 = "protocol1 " + data;
        System.out.println(data2);
        protocol2(data2);
    }

    public static void protocol2(String data) {
        String data2 = "protocol2 " + data;
        System.out.println(data2);
        protocol3(data2);

    }

    public static void protocol3(String data) {
        String data2 = "protocol3 " + data;
        System.out.println(data2);
        protocol4(data2);

    }

    public static void protocol4(String data) {
        String data2 = "protocol4 " + data;
        System.out.println(data2);
        protocol5(data2);

    }

    public static void protocol5(String data) {
        String data2 = "protocol5 " + data;
        System.out.println(data2);
        protocol6(data2);

    }

    public static void protocol6(String data) {
        String data2 = "protocol6 " + data;
        System.out.println(data2);
        protocol7(data2);

    }

    public static void protocol7(String data) {
        String data2 = "protocol7 " + data;
        System.out.println(data2);
    }
}