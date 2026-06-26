package Coding_Exercises;

public class L_Right_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        int num = 6;

        for (int i=1 ; i<=num ; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output
//*
//**
//***
//****
//*****
//******