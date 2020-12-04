
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DocsShape register =new DocsShape();
        Letter letter= (Letter) register.get("Administrative letter blue template");
        System.out.println(register);
    }
}
