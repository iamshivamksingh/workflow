package org.shivam;

public class Request {

    private String oem;
    private String program;

    public Request() {
    }

    public Request(String oem, String program) {
        this.oem = oem;
        this.program = program;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
