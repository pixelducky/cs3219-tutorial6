package cs3219.jms.order;

public interface IPipe {
    public void write(Order s);
    public Order read();    
    public void close();
}
