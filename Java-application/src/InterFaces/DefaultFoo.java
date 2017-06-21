package InterFaces;

public class DefaultFoo implements Foo {
    private String Message;

    public DefaultFoo(String Message){
        this.Message=Message;
    }
    @Override //Anotation of override
    public String say(){
        return Message;
    }
}
