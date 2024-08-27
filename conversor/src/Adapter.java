public class Adapter extends Target{
    private Adaptee adaptee;

    public void AdapterTomada(Adaptee tomadaDeTresPinos){
        this.adaptee = tomadaDeTresPinos;
    }

    public void ligarNaTomadaDeDoisPinos(){
        adaptee.ligarNaTomadaDeTresPinos();
    }
}
