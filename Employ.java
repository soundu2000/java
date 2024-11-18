class Employ {
    public void work() {
        System.out.println("Employ is working");
    }
}


public class Main {
    public static void main(String[] args) {
        Employ employ = new Manager();  
              
        if (employee instanceof Manager) {
            Manager manager = (Manager) employ; 
            manager.manage(); 
        } else {
            System.out.println("The object is not an instance of Manager");
        }
    }
}
