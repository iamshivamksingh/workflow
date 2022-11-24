package org.shivam;

public class OemTask {

    public void process(Request r, Collector c) {
        System.out.println("OEM task is called");
        c.setOem(r.getOem());
        c.setOemCode("GM");
    }
}
