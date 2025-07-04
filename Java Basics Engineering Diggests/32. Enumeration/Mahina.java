public enum Mahina {

    Jan("january"),
    Feb("february"),
    March("March");


    private Mahina (String lower){
        System.out.println("Called..");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    private String lower;



    public void display(){
        System.out.println("Months "+this.name());
    }

}
