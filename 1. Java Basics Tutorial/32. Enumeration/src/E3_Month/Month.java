package E3_Month;

public enum Month {

    Jan("January"),
    Feb("February"),
    March("March");


    private Month(String lower){
        System.out.println("Called..");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    private String lower;

    public void display(){
        System.out.println("E4_Month.Month "+this.name());
    }

}
