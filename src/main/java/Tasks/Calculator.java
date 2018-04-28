package Tasks;

public class Calculator {
    private double valueFirst;
    private double valueSecond;

    public Calculator (double valueFirst, double valueSecond) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    public double getValueFirst() {
        return valueFirst;
    }

    public void setValueFirst(double valueFirst) {
        this.valueFirst = valueFirst;
    }

    public double getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(double valueSecond) {
        this.valueSecond = valueSecond;
    }

    public double plus() {
        return this.getValueFirst() + this.getValueSecond();
    }

    public double minus() {
        return this.getValueFirst() - this.getValueSecond();
    }

    public double umnozhit() {
        return this.getValueFirst() * this.getValueSecond();
    }

    public double delit() {
        return this.getValueFirst() / this.getValueSecond();
    }
}
