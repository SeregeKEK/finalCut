package HW3.Exception;

public class SexException extends Exception{
    public SexException(){
    }

    public void sexException(String i) {
        System.out.println("Ошибка: введены некорректные данные.");
        System.out.printf("Было введено: %s\nожидается: f или m", i);
        System.out.println();
    }
}
