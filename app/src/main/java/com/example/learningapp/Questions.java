package com.example.learningapp;

public class Questions {
    int imgId;
    String op1,op2,op3,correctAns;

    public Questions(int imgId, String op1, String op2, String op3, String correctAns) {
        this.imgId = imgId;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.correctAns = correctAns;
    }

    public int getImageId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
}

