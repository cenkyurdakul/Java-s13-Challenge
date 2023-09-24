package com.workintech.employeeApp.Model;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        try {
        boolean isExist = false;
        for(String healthPlan: healthPlans){
            if(healthPlan != null && healthPlan.equals(name)){
                isExist = true;
                break;
            }
        }

        if(!isExist){
            if(healthPlans[index] == null){
            healthPlans[index] = name;
            } else {
                System.out.println("İlgili index dolu!");
            }
        } else{
            System.out.println("Bu isimde healthplan mevcut: " + name);
        }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid index: " + index);
        } catch (NullPointerException npe){
            System.out.println("Null Pointer exception: " + npe.getMessage());
        } catch (Exception ex){

        }


    }
}
