package org.shivam;

public class ProgramTask {

    public void process(Request r, Collector c) {
        System.out.println("PROGRAM task is called");
        c.setProgram(r.getProgram());
        c.setProgramName("EV");
    }

}
