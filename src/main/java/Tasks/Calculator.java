package Tasks;

/**
 * Класс Калькулятор
 * Объект хранит значения двух дробных чисел и осуществляет операции над ними
 *
 * @author Natalia Litvinova
 */

public class Calculator {
    /**
     * Атрибуты класса:
     * Дробное число valueFirst - первое число для операции
     * Дробное число valueSecond - второе число для операции
     */
    private double valueFirst;
    private double valueSecond;


    /**
     * Конструктор с заданными параметрами
     *
     * @param valueFirst Первое дробное число
     * @param valueSecond Второе дробное число
     */
    public Calculator (double valueFirst, double valueSecond) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    /**
     * Геттер для первого числа
     *
     * @return Возвращает значение первого числа данного объекта
     */
    public double getValueFirst() {
        return valueFirst;
    }

    /**
     * Сеттер для первого числа
     *
     * @param valueFirst Дробное число
     */
    public void setValueFirst(double valueFirst) {
        this.valueFirst = valueFirst;
    }

    /**
     * Геттер для второго числа
     *
     * @return Возвращает значение второго числа данного объекта
     */
    public double getValueSecond() {
        return valueSecond;
    }

    /**
     * Сеттер для второго числа
     *
     * @param valueSecond Дробное число
     */
    public void setValueSecond(double valueSecond) {
        this.valueSecond = valueSecond;
    }

    /**
     * Метод для сложения двух чисел, хранящихся в текущем объекте
     *
     * @return Результат сложения двух чисел
     */
    public double plus() {
        return this.getValueFirst() + this.getValueSecond();
    }

    /**
     * Метод для вычитания из первого числа, хранящегося в текущем объекте, второго числа
     *
     * @return Разность двух чисел
     */
    public double minus() {
        return this.getValueFirst() - this.getValueSecond();
    }

    /**
     * Метод для умножения первого числа, хранящегося в текущем объекте, на второе число
     *
     * @return Произведение двух чисел
     */
    public double umnozhit() {
        return this.getValueFirst() * this.getValueSecond();
    }

    /**
     * Метод для деления первого числа, хранящегося в текущем объекте, на второе число
     *
     * @return Частное двух чисел
     */
    public double delit() {
        return this.getValueFirst() / this.getValueSecond();
    }
}
