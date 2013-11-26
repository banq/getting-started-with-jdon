package hello;

import com.jdon.util.UtilValidate;

public class HelloWorld {
  public static void main(String[] args) {
  	String s ="hello";
  	if (!UtilValidate.isEmpty(s))
        System.out.println("hello");
  }
}