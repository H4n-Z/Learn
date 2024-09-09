package Aufgaben.InstanceTest;

public class Gun {
    private String name;
    private String type;
    private float caliber;
    private int number;

    public void setName (String name){
        this.name = name;
    }
    public void setType (String type){
        this.type = type;
    }
    public void setCaliber (float caliber){
        this.caliber = caliber;
    }
    public void setNumber (int number){
        this.number = number;
    }

    public String getName () {
        return name;
    }
    public String getType () {
        return type;
    }
    public float getCaliber () {
        return caliber;
    }
    public int getNumber () {
        return number;
    }
}
