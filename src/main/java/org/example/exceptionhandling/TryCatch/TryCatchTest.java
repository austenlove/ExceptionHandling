package org.example.exceptionhandling.TryCatch;

import org.example.exceptionhandling.DelegateThrows.ThrowTest;

import java.io.IOException;

public class TryCatchTest {

    /** try-catch(또는 try-catch-finally)로 예외 처리 */

    public static void main(String[] args) {
        ThrowTest tTest = new ThrowTest();
        
        try {
            tTest.methodA();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            System.out.println("프로그램 종료");
        }
    }

}
