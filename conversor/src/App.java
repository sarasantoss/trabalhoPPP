public class App {
    public static void main(String[] args) throws Exception {
       Adaptee TomadadeTresPinos = new Adaptee();

       Adapter a = new Adapter(TomadadeTresPinos);

       a.ligarNaTomadaDeDoisPinos();
        
    }
}
