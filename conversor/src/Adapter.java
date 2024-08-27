public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee tomadaDeTresPinos){
        this.adaptee = tomadaDeTresPinos;
    }

    @Override
    public void ligarNaTomadaDeDoisPinos(){
        adaptee.ligarNaTomadaDeTresPinos();
    }
}
