package Encapsulations;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Employeedata {
    public String Name;
    public String Surname;
    private int Age;

    public void getEmpName(){
        System.out.println("EmpName");}
    public void getSurname(){
            System.out.println("EmpSurname");}
    public void setAge(int Age){
        this.Age=Age;}
        public int getAge(){
            return Age;
        }



        }


