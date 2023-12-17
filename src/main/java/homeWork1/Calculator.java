package homeWork1;

public class Calculator {

    public double calculateDiscount(double amount, int discount){
        if (discount > 100 || discount < 0){
            throw new ArithmeticException("Скидка должна быть больше или равна 0% и меньше " +
                    "или равна 100%");
        }
        else if (amount < 0){
            throw new ArithmeticException("Сумма покупки должна быть больше 0");
        }
        return amount - (amount * discount / 100);
    }
}
