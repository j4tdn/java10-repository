public class Vehicle {
    private int id,capacity;
    private double value;
    private String name,describe;
 
    public Vehicle(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
        this.id = maXe;
        this.capacity = dungTich;
        this.value = triGia;
        this.name = chuXe;
        this.name = moTa;
    }
    public Vehicle(){
 
    }
    public int getMaXe() {
        return id;
    }
 
    public void setMaXe(int maXe) {
        this.id = maXe;
    }
 
    public int getDungTich() {
        return capacity;
    }
 
    public void setDungTich(int dungTich) {
        this.capacity = dungTich;
    }
 
    public double getTriGia() {
        return value;
    }
 
    public void setTriGia(double triGia) {
        this.value = triGia;
    }
 
    public String getChuXe() {
        return name;
    }
 
    public void setChuXe(String chuXe) {
        this.name = chuXe;
    }
 
    public String getMoTa() {
        return name;
    }
 
    public void setMoTa(String moTa) {
        this.name = moTa;
    }
 
    public double tinhThue(){
        double thue;
        if(capacity<100) thue=value*0.01;
        else if (capacity >= 100 && capacity<=200) thue = value * 0.03;
        else thue = value * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return id + "-"+name + "-"+capacity + "-"+value + "-"+name;
}
 
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",id,name,capacity,value,name,tinhThue());
    }
}