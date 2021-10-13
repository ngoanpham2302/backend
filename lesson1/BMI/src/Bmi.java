public class Bmi {
    // Viết phương thức tính BMI có kiểu trả về là void
    public void calBmi() {
        double weight = 42;
        double height = 1.58;
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI(1) là: " + bmi);
    }

    // Viết phương thức tính BMI có kiểu trả về là double
    public double calculateBmi() {
        double weight = 65;
        double height = 1.62;
        double bmi = weight / (height * height);
        return bmi;
    }

    // Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
    public double calBmiWithPara(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;
    }
}
