package opps_practical;

import java.util.Scanner;
class Programmer {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Programmer p = new Programmer();
        System.out.print("Enter programmer name: ");
        String inputName = sc.nextLine();

        p.setName(inputName); 
        System.out.println("Name => " + p.getName());
1
        sc.close();
    }
}