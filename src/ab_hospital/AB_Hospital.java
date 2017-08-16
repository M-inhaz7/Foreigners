package ab_hospital;

class Doctor{
    int id;
    String name;
    int no_of_patient=449;
    Doctor(int id,String name){
        this.id = id;
        this.name = name;
    }
}
class Patient{
    int id;
    String name;
    String Doc_info;
    String Appoint_info;
    Patient(int id, String name, String Doc_info){
        this.id = id;
        this.name = name;
        this.Doc_info = Doc_info;
    }
}
class Admin{
    void appointment(Patient P, Doctor D){
        if(D.name.equals(P.Doc_info)){
            if(D.no_of_patient%15 != 0){
                System.out.println("Your appointment is approved to "+D.name);
                P.Appoint_info = "Approved";
                D.no_of_patient++;
            }
            else{
                System.out.println("Sorry! Housefull");
            }
        }
    }
    void Salary(Doctor D){
        if(D.no_of_patient == (15*30)){
            System.out.println("We are Greatful to you sir\nYour salary is provided: "+(50*(1000*30)/100));
        }
    }
}

public class AB_Hospital {

    public static void main(String[] args) {
        // TODO code application logic here
        Doctor D = new Doctor(1,"Mr.Alam");
        Patient P = new Patient(14,"Mr.Ali","Mr.Alam");
        Admin A = new Admin();
        A.appointment(P,D);
        A.Salary(D);
    }
    
}
