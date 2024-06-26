package org.example.exceptionhandling.PossibleExceptionRange;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 예외 없이 오버라이딩 가능 */
//    @Override
//    public void method() {}   //정상

    /* 같은 예외를 던져주는 구문으로 오버라이딩 */
//    @Override
//    public void method() throws IOException {}   //정상

    /* 부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 불가 */
//    @Override
//    public void method() throws Exception {}   //에러

    /* 더 구체적인 예외상황)인 경우에는 오버라이딩 가능 */
//    @Override
//    public void method() throws FileNotFoundException {}   //정상

}
