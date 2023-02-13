package Week4_Practice;

public class Person {
    private String name;
    private int age;
    private boolean isUnivStd;
    private double weight;

    public Person(String name, Object age, boolean isUnivStd, Object weight) {
        this.name = name;
        ageValueTypeAdapter(age);
        this.isUnivStd = isUnivStd;
        weightValueTypeAdapter(weight);
    }

    private void weightValueTypeAdapter(Object weight) {
        if(weight instanceof String){
            String temp = (String) weight;
            this.weight = Double.parseDouble(temp);
        } else if (weight instanceof Double){
            Double temp = (double) weight;
            this.weight = temp.doubleValue();
        }
    }

    private void ageValueTypeAdapter(Object age) {
        if(age instanceof String){
            String temp = (String) age;
            this.age = Integer.parseInt(temp);
        } else if (age instanceof Integer){
            Integer temp = (Integer) age;
            this.age = temp.intValue();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnivStd() {
        return isUnivStd;
    }

    public void setUnivStd(boolean univStd) {
        isUnivStd = univStd;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printProfile(){
        System.out.println("이름 :" + name + '\n' +
                "나이 :" + age + '\n' +
                "대학생인가요? :" + isUnivStd + '\n' +
                "몸무게 :" + weight);

        System.out.print("\n \n");
    }

    @Override
    public String toString() {
        return "이름 :" + name + '\n' +
                "나이 :" + age + '\n' +
                "대학생인가요? :" + isUnivStd + '\n' +
                "몸무게 :" + weight;
    }
}
