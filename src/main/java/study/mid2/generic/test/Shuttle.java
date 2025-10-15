package main.java.study.mid2.generic.test;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public T out() {
        return this.unit;
    }

    public void showInfo() {
        System.out.println(this.unit);
    }
}
