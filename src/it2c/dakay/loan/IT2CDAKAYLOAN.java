
package it2c.dakay.loan;

import java.util.Scanner;


public class IT2CDAKAYLOAN {


    
      public void addApplicant(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Full Name (family name/given name/middle initial): ");
        String fname = sc.nextLine();
         System.out.print("Date of birth (month/day/year): ");
        String birth = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();
         System.out.print("Address (purok/barangay/city/province): ");
        String address = sc.nextLine();
         System.out.print("Email Address: ");
        String email = sc.nextLine();
        System.out.print("Status (Employed,Unemployed): ");
        String status = sc.nextLine();
        System.out.print("Monthly income: ");
        String monthlyincome = sc.nextLine();

        
        String sql = "INSERT INTO tbl_applicants (A_fname, A_birth, A_age, A_contact, A_address, A_email, A_status, A_monthlyincome) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";


        conf.addRecord(sql, fname, birth, age, contact, address, email, status, monthlyincome);


    }
         
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String response;
       
        do{
            System.out.println("\n1. Add Applicant");
            System.out.println("2. View Applicant");
            System.out.println("3. Update Applicant");
            System.out.println("4. Delete Applicant");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nChoose an option: ");
           
            System.out.print("\n Enter Action: ");
            int action = sc.nextInt();
            IT2CDAKAYLOAN demo = new IT2CDAKAYLOAN();
         
          switch(action){
                
                case 1:    
                demo.addApplicant();            
                break;
                
                case 2:
                demo.viewApplicant();
                    break;
                case 3:
                demo.viewApplicant();
                demo.updateApplicant();
                break;
                case 4:
                demo.viewApplicant();
                demo.deleteApplicant(); 
                demo.viewApplicant();
                break;
           
        
            }
            System.out.print("continue (YES/NO): ");
    response = sc.next();
    
        }while(response.equals("yes"));
        System.out.println("thank you . see you again ");
        
    }
    
 
    
    

private void viewApplicant() {
        String aqry = "SELECT * FROM tbl_applicants";
        String[] hrds = {"ID", "FULL Name", "DATE OF BIRTH", "AGE", "CONTACT NUMBER", "ADDRESS", "EMAIL", "STATUS", "MONTHLY INCOME"};
        String[] clmns = {"A_id", "A_fname", "A_birth", "A_age", "A_contact", "A_address", "A_email", "A_status", "A_monthlyincome"};
        config conf = new config();
        conf.viewRecords(aqry, hrds, clmns);
    }



   private void updateApplicant(){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter Applicant ID: ");
   int id = sc.nextInt();
            sc.nextLine(); 
            
        System.out.print("Updated Full Name (family name/given name/middle initial): ");
        String ufname = sc.nextLine();
         System.out.print("Updated Date of birth (month/day/year): ");
        String ubirth = sc.nextLine();
        System.out.print("Updated Age: ");
        String uage = sc.nextLine();
        System.out.print("Updated Contact: ");
        String ucontact = sc.nextLine();
         System.out.print("Updated Address (purok/barangay/city/province): ");
        String uaddress = sc.nextLine();
         System.out.print("Updated Email Address: ");
        String uemail = sc.nextLine();
        System.out.print("Updated Status (Employed, Unemployed): ");
        String ustatus = sc.nextLine();
        System.out.print("Updated Monthly income: ");
        String umonthlyincome = sc.nextLine();  
      
      String qry = "UPDATE tbl_applicants SET A_fname = ?, A_birth = ?, A_age = ?, A_contact = ?, A_address = ?, A_email = ?, A_status = ?, A_monthlyincome = ? WHERE A_id = ? ";
    
   config conf = new config();
   conf.updateRecord(qry, ufname, ubirth, uage, ucontact, uaddress, uemail, ustatus, umonthlyincome, id);
   
   
   
   }
   
   
   
   
  private void deleteApplicant(){

       Scanner sc = new Scanner(System.in);
   System.out.print("Enter Applicant ID to delete: ");
   int id = sc.nextInt(); 
   
   String sqlDelete = "DELETE FROM tbl_applicants WHERE A_id = ?";
   config conf = new config();
   conf.deleteRecord(sqlDelete, id);
    }
  
  
  
  
  
  
  
} 
   
   
   
   
   
 

    
