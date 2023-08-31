package September;

public class Phone {
    private int weight;
    private String number;
    private String model;
    private String status;

    public Phone() {
        status = "waiting";
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        status = "waiting";
    }
    public Phone(String number, String model, int weight) {
        this.weight = weight;
        this.number = number;
        this.model = model;
        status = "waiting";
    }

    public void receiveCall(String caller){
        this.status = caller;
    }
    public void hangup(){
        status = "waiting";
    }

    public String getStatus() {
        return status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
