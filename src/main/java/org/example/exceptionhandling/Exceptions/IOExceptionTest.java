package org.example.exceptionhandling.Exceptions;

import java.io.*;

public class IOExceptionTest {

    /** IOException
     *  파일 입출력, 네트워크 입출력, 스트림 조작 중 발생하는 예외를 처리하는 데 사용되는 예외 클래스
     *  Checked Exception으로 반드시 예외 처리를 해야 하며, 컴파일 시 강제로 처리하도록 요구
     *
     *  하위 클래스
     *  FileNotFoundException: 지정된 파일을 찾을 수 없을 때 발생
     *  EOFException: 데이터 스트림의 끝에 도달했을 때 발생
     *  SocketException: 네트워크 소켓과 관련 오류가 발생했을 때 발생
     *  InterruptedIOException: I/O 작업이 중단될 때 발생
     *  */

    public static void main(String[] args) {

        // 파일 읽기 예제
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류 발생: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.out.println("파일을 닫는 도중 오류 발생: " + ex.getMessage());
            }

        }

        // 파일 쓰기 예제
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello World");

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                System.out.println("파일을 닫는 도중 오류 발생: " + ex.getMessage());
            }

        }

        // 스트림에서 데이터 읽기 예제
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;

            // 파일 한 줄씩 읽기
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류 발생: " + e.getMessage());

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.out.println("파일을 닫는 도중 오류 발생: " + ex.getMessage());

            }
        }

        // 스트림에서 데이터 쓰기 예제
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello World");
            writer.newLine();
            writer.write("Java File IO Example");

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류 발생: " + e.getMessage());

        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                System.out.println("파일을 닫는 도중 오류 발생: " + ex.getMessage());
            }
        }

        /** 예외 처리 패턴
         *  try 블록에서 I/O 작업을 수행
         *  catch 블록에서 IOException 처리
         *  finally 블록에서 자원 정리 (+여기서도 IOException이 발생할 수 있으므로 추가적인 예외 처리 필요)
         * */

        /** 주요 예외 처리 방법
         *  파일 접근 권한: 파일을 열 때 적절한 권한이 부여되었는지 확인
         *  경로 확인: 파일 경로가 올바르게 설정되어 있는지 확인
         *  네트워크 상태: 네트워크 연결 상태를 확인하고, 안정적인 네트워크를 사용
         *  리소스 정리: 스트림이나 소켓을 사용한 후 적절히 닫아줌
         * */


    }
}
