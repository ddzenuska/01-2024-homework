package io.codelex.arithmetic.practice;

import java.text.DecimalFormat;

public class FooSalaryCalc {
    public static void main(String[] args) {
        String employeeOne = salaryCalc(35, 7.50); // declared employees and assigning method call.
        String employeeTwo = salaryCalc(47, 8.20);
        String employeeThree = salaryCalc(73, 10.00);

        System.out.println(employeeOne); // printing method returned results.
        System.out.println(employeeTwo);
        System.out.println(employeeThree);
    }

    public static String salaryCalc(int workedH, double baseP) { // method calculates salary.
        int oTHours = 0;
        int baseHours = 0;
        double oTSalary = 0;
        double pay = 0;
        double baseHourlyPay = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        if (workedH > 40 && workedH <= 60) {
            oTHours = workedH - 40;
            oTSalary = (oTHours * 1.5) * baseP;
            baseHours = workedH - oTHours;
            pay = (oTSalary + (baseHours * baseP));
            return "Employee worked " + workedH + "h. Overtime is " + oTHours + "h, which" +
                    "\nshould pay " + df.format(oTSalary) + "$. Salary is: " + df.format(pay) + "$.\n";
        } else if (workedH < 40) {
            pay = baseP * workedH;
            return "Employee worked " + workedH + "h and there is no overtime." +
                    "\nSalary is: " + df.format(pay) + "$.\n";
        } else if (workedH > 60) {
            baseHourlyPay = baseP * 40;
            oTSalary = (20 * 1.5) * baseP;
            pay = (oTSalary + baseHourlyPay);
            return "Employee worked more than 60 hours. Overtime is 20h, which" +
                    "\nshould pay " + df.format(oTSalary) + "$. Salary is: " + df.format(pay) + "$.\n";
        }

        return "invalid Input";
    }
}
