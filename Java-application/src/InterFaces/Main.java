package InterFaces;

import InterFaces.DefaultFoo;
import InterFaces.Foo;

public class Main {

    public static void main(String[] args) {
        SampleMessage sample=new SampleMessage();
        String respone=sample.Action();
        System.out.println(respone);

        Foo foo =new DefaultFoo("おぎゃあおぎゃあ");
        System.out.println(foo.say());
    }
}
