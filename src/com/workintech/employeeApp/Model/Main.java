package com.workintech.employeeApp.Model;

import com.workintech.employeeApp.enums.Plan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Healthplan plan1 = new Healthplan(1,"A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2,"B Sigorta", Plan.BASIC);


        System.out.println(plan1);
        System.out.println(plan2);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee employee = new Employee(1, "Ali Veli", "ali@veli.com",
                "1234",healthPlans);
        employee.addHealthPlan(0, "C Sigorta");
        employee.addHealthPlan(2, "A Sigorta");
        employee.addHealthPlan(2, "C Sigorta");

        System.out.println(Arrays.toString(employee.getHealthPlans()));

        employee.addHealthPlan(3, "D Sigorta");

        Employee developer = new Employee(2, "Mehmet ali", "mehmet@test.com",
                "1234", healthPlans);
        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();
        System.out.println("****************************************");
        Company company = new Company(1, "Workintech", 100000000, developerNames);
        company.addEmployee(0, "Cenk Yurdakul");
        company.addEmployee(5, "Cenk Yurdakul");
        company.addEmployee(1,"Cenk Yurdakul");
        System.out.println(company);

    }


}
