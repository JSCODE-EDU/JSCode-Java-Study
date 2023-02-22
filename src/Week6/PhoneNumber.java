package Week6;

public class PhoneNumber {

    private String value;

    public PhoneNumber(String value) {
        this.validate(value);
        this.value = value;
    }

    private void validate(String phoneNumber) {

        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다");
        }

        if (!phoneNumber.startsWith("010")) {
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야합니다");
        }
    }


    public String getPhoneNumberFormally() {
        return (this.value.substring(0, 3) + "-" + this.value.substring(3, 7) + "-"
            + this.value.substring(7, 11));
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public class phoneNumberTypeMismatchException extends Exception {

    }
}
