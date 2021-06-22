package com.example.calc.vos;

public class CalcVo {
    // Encapsulation (은닉화) : 변수의 접근 제한자(Access Modifier)를 Private 으로 둠.
    private int a; // 전역변수로 선언시 지역변수와는 다르게 기본값으로 0이 들어감. reference type 은 null 이 들어감.
    private int b;
    private String op;

    public CalcVo() {
    }

    public CalcVo(int a, int b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
