package org.example.exceptionhandling.Exceptions;

public class RuntimeExceptionTest {

    /** RuntimeException
     *  컴파일 타임이 아닌 프로그램 실행 중 발생하는 예외로, Unchecked Exception에 해당 */

    public static void main(String[] args) {

        /** RuntimeException의 하위 클래스 */

        /** NullPointException : 객체가 null 일때 해당 객체의 멤버를 참조하려고 할 때 발생 */
        int[] intArr = null;
        try {
            System.out.println(intArr[0]);
        } catch (NullPointerException e) {
            System.out.println("💥NPE 발생: " + e.getMessage());
        }

        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("💥NPE 발생: " + e.getMessage());
        }


        /** ArrayIndexOutOfBoundsException : 배열의 index 범위를 넘어서 참조하는 경우 발생 */
        int[] intArr1 = new int[0];
        try {
            System.out.println(intArr1[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("💥index 범위 초과: " + e.getMessage());
        }

        /** ArithmeticException : 0으로 나누는 경우 발생 */
        int dividend = 3;
        try {
            System.out.println(dividend/0);
        } catch (ArithmeticException e) {
            System.out.println("💥ArithmeticException 발생: " + e.getMessage());
        }

        /** ClassCastException : 형 변환 시 자료형에 문제가 있을 때 발생 */
        Object obj = new String("hello");
        try {
            int num = (int) obj;
        } catch (ClassCastException e) {
            System.out.println("💥ClassCastException 발생: " + e.getMessage());
        }

        /** NegativeArraySizeException : 배열 크기를 음수로 지정한 경우 발생 */
        try {
            int[] intArr2 = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("💥NegativeArraySizeException 발생: " + e.getMessage());
        }
    }
}
