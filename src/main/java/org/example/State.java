package org.example;

public interface State {
    public void setState(State state);
    public void confirmed() throws Exception;
    public void canceled() throws Exception;
    public void boarding() throws Exception;
    public void setGate(String newGate) throws Exception;
    public void delayed(Long minutes) throws Exception;
    public String toString();
}
