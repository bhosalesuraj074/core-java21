package com.core.basiccodes;

public class BreakLabel {
    public static void main(String[] args) {
        boolean flag = false;
        first:{

            second:{

                    third:{

                        System.out.println("Third block");
                        if (!flag)
                        break second;
                    }
                    System.out.println("Second block");
            }
            System.out.println("First Block");
        }

    }
}
