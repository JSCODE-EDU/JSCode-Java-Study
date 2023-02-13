package Week4_Practice;

public class Calculator {
    private String Owner;

    public Calculator(String Owner) {
        this.Owner = Owner;
    }

    public int add(Object op1, Object op2){

        int convertedOp1 = typeRecognitionAndConversion(op1);
        int convertedOp2 = typeRecognitionAndConversion(op2);

        return convertedOp1 + convertedOp2;
    }

    public int minus(Object op1, Object op2){

        int convertedOp1 = typeRecognitionAndConversion(op1);
        int convertedOp2 = typeRecognitionAndConversion(op2);

        return convertedOp1 - convertedOp2;

    }

    public int multiply(Object op1, Object op2){

        int convertedOp1 = typeRecognitionAndConversion(op1);
        int convertedOp2 = typeRecognitionAndConversion(op2);

        return convertedOp1 * convertedOp2;

    }

    public double divide(Object op1, Object op2){

        int convertedOp1 = typeRecognitionAndConversion(op1);
        int convertedOp2 = typeRecognitionAndConversion(op2);

        return ((double)convertedOp1) / convertedOp2;

    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        this.Owner = owner;
    }

    public int typeRecognitionAndConversion(Object target) {

        if (target instanceof Integer) {
            return ((Integer) target).intValue();
        } else {
            return Integer.parseInt((String) target);
        }

    }
}
