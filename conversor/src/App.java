public class App {
    public static void main(String[] args) throws Exception {
    //    Adaptee TomadadeTresPinos = new Adaptee();

    //    Adapter a = new Adapter(TomadadeTresPinos);

    //    a.ligarNaTomadaDeDoisPinos();
        
    Target teste = new Target();
    teste.EnvioDeEmail("saramiranda2004@gmail.com", "saramiranda201814@gmail.com");
    }
}
