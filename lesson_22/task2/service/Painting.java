package homework_32.task1.task2.service;

public class Painting implements Serviceable{

    private String typeWorkDescription;
    private String workStatus;

    public Painting(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "Start painting";
    }

    @Override
    public void assignWork(String typeWorkDesctiption) {
        this.typeWorkDescription = typeWorkDesctiption;
        this.workStatus =  "In progress";
    }

    @Override
    public String getWorkStatus() { return typeWorkDescription + " : " + workStatus; }

    @Override
    public void changeWorkStatus(String newStatus) { workStatus = newStatus;}
}
