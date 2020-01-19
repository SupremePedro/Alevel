package ua.com.alevel.classworks.lesson11.exception;

public class Calculator {

    private int arg;
    private int arg1;

    private double answer;

    public Calculator(int arg, int arg1){
        this.arg = arg;
        this.arg1 = arg1;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

     public double getDivision(){
        double answer = getArg()/getArg1();
        setAnswer(answer);
        return getAnswer();
    }
}
