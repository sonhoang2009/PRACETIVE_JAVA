package Pracite.EX2;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        this.number = 0;
        this.destination="";
    }

    public Flight(int number, String destination){
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display(){
        if (number>0) {
            System.out.println(number + "," + destination);
        }
        else {
            number = 0;
            destination ="";
            System.out.println(number + ","+destination);
        }
    }

}
