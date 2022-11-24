package org.shivam;

public class Collector {

    private String oem;
    private String oemCode;
    private String program;
    private String programName;

    public Collector() {
    }

    public Collector(String oem, String oemCode, String program, String programName) {
        this.oem = oem;
        this.oemCode = oemCode;
        this.program = program;
        this.programName = programName;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getOemCode() {
        return oemCode;
    }

    public void setOemCode(String oemCode) {
        this.oemCode = oemCode;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public String toString() {
        return "Collector{" + "oem='" + oem + '\'' + ", oemCode='" + oemCode + '\'' + ", program='" + program + '\'' + ", programName='" + programName + '\'' + '}';
    }
}
