package org.example.exceptionhandling.TryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceTest {

    public static void main(String[] args) {

        /** try-catch-finally 구문 */
        BufferedReader reader1 = null;

        try {
            reader1 = new BufferedReader(new FileReader("file.txt"));
            String line;

            while ((line = reader1.readLine()) != null) {
                System.out.println(line);
            }

        } catch(IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        /** try-with-resource 구문
         *  자바 7버전에서 추가된 기능으로 입출력에서 사용되는 스트림의 자원반납 close()을
         *  finally 블럭을 사용하지 않고 용이하게 처리하기 위해 도입된 문법
         *  (AutoCloseable 인터페이스를 구현)
         * */
        try (BufferedReader reader2 = new BufferedReader(new FileReader("file.txt"))) {

            String line;
            while ((line = reader2.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /* try-with-resources 구문을 사용하면 여러 개의 자원을 다룰 때 예외가 중첩되지 않음
         * 각 자원의 close() 메서드가 순서대로 호출되며, 이 과정에서 발생하는 예외 모두 처리 */

    }

}
