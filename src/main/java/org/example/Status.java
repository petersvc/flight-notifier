package org.example;

public interface Status {
     public void nextStatus(Status status);
    public String toString();
  
    public void confirmed() throws Exception;
    public void canceled() throws Exception;
    public void boarding() throws Exception;
    public void changedgate(String newGate) throws Exception;
    public void delayed(Long minutes) throws Exception;

}
