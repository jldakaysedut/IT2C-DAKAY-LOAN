
package it2c.dakay.loan;

import java.util.Scanner;


public class IT2CDAKAYLOAN {


    
      public void addStudents(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("First Name: ");
        String fname = sc.next();
         System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Age: ");
        String age = sc.next();
        System.out.print("Status (Employed,Unemployed): ");
        String status = sc.next();
        System.out.print("Monthly income: ");
        String monthlyincome = sc.next();

        String sql = "INSERT INTO tbl_applicants (A_fname, A_lname, A_age, A_status, A_monthlyincome) VALUES (?, ?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, age, status, monthlyincome);


    }
         
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String response;
       
        do{
            System.out.println("\n1. Add Person");
            System.out.println("2. View Persons");
            System.out.println("3. Delete Person");
            System.out.println("4. Update Person");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nChoose an option: ");
           
            System.out.print("\n Enter Action: ");
            int action = sc.nextInt();
            
            switch(action){
                
                case 1:
                IT2CDAKAYLOAN demo = new IT2CDAKAYLOAN();
                demo.addStudents();
                
                break;
           
        
            }
            System.out.print("continue (YES/NO): ");
    response = sc.next();
    
        }while(response.equals("yes"));
        System.out.println("thank you . see you again ");
        
    }
    
 
    
    

    
}