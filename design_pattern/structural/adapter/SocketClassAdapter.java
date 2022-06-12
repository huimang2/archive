package design_pattern.structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {
    
    @Override
    public Volt get220Volt() {
        return getVolt();
    }
    
    @Override
    public Volt get110Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 2);
    }

    private Volt convertVolt(Volt volt, int i){
        return new Volt(volt.getVolt()/i);
    }
}