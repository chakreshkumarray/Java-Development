package Topic9_TypeErasure;

class Numbers<T extends Number>{

    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

}
