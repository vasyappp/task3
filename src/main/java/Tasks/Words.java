package Tasks;

/**
 * Класс Слова
 * Хранит массив слов и осуществляет в нем поиск слова максимальной длины
 *
 * @author Natalia Litvinova
 */

public class Words {
    /**
     * Атрибуты класса:
     * Массив слов words
     */
    private String[] words;


    /**
     * Конструктор с заданными параметрами
     *
     * @param words Массив слов
     */
    public Words(String[] words) {
        this.words = words;
    }

    /**
     * Геттер для массива слов
     *
     * @return Массив слов
     */
    public String[] getWords() {
        return words;
    }

    /**
     * Сеттер для массива слов
     *
     * @param words Массив слов
     */
    public void setWords(String[] words) {
        this.words = words;
    }

    /**
     * Метод поиска в массиве слова максимальной длины
     *
     * @return Слово максимальной длины
     */
    public String findLongest() {
        //Получение массива слов, хранящегося в текущем объекте
        String[] words = this.getWords();

        //Задание начальных значений максимальной длины слова и слова этой длины
        int maxLength = words[0].length();
        String longestWord = words[0];

        //Поиск слова максимальной длины
        for (String word : words) {
            if (word.length() > maxLength) {
                //Если длина просматриваемого слова больше установленной, задать новые значения переменным
                maxLength = word.length();
                longestWord = word;
            }
        }

        //Возвращение слова максимальной длины
        return longestWord;
    }
}
