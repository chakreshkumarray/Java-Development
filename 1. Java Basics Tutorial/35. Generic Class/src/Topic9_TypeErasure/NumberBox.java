package Topic9_TypeErasure;

class NumberBox<T extends Number>{

    private T number;  // T --> Number

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

}
