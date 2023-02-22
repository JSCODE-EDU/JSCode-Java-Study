package Week6_Practice;

public class Money {

    private int value;

    public Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj instanceof Money) {
            Integer compareValue = ((Money) obj).getValue();
            if (compareValue.intValue() == getValue()) {
                return true;
            }
        }

        return false;
    }
}
