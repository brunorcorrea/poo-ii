package main;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Erro personalizado");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
