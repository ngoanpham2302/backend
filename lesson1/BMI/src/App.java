public class App {
    public static void main(String[] args) {
        Bmi myBmi = new Bmi();

        // Tính BMI có kiểu trả về là void
        myBmi.calBmi();

        // Tính BMI có kiểu trả về là double
        System.out.println("Chỉ số BMI(2) là: " + myBmi.calculateBmi());

        // Tính BMI có kiểu trả về là double và có truyền tham số
        double myWeight = 58;
        double myHeight = 1.65;
        double bmiResult = myBmi.calBmiWithPara(myWeight, myHeight);
        System.out.println("Chỉ số BMI của người có cân nặng " + myWeight + "kg và chiều cao " + myHeight + "m là: " + bmiResult);
        
        // So sánh sử dụng phương thức nào là tốt nhất:
        /* Sử dụng phương thức tính BMI có kiểu trả về là double và có truyền tham số là tốt nhất, vì có thể tái sử dụng, truyền được nhiều đối số khác nhau. */
    }
}
