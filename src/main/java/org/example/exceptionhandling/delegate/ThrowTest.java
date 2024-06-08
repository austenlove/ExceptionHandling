package org.example.exceptionhandling.delegate;

import java.io.IOException;

public class ThrowTest {

    /** Exception이 발생하는 메소드를 호출한 상위 메소드에게 처리를 위임하는 방식으로 예외 처리 */

    public static void main(String[] args) {
        ThrowTest tTest = new ThrowTest();

        try {
            tTest.methodA();;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void methodA() throws IOException {
        methodB();
    }

    private void methodB() throws IOException {
        methodC();
    }

    private void methodC() throws IOException {
        throw new IOException();
    }

}
