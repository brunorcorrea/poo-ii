package main;

//import main.another.PackageClassAccess; //Não é possível acessar a classe de pacote
import main.another.PublicClassAccess;

public class PackageAccessMain {
    public static void main(String[] args) {
        PublicClassAccess publicClassAccess = new PublicClassAccess("Texto na classe pública");
        System.out.println(publicClassAccess.getText());
        //PackageClassAccess packageClassAccess = new PackageClassAccess("Texto na classe de pacote"); //Não é possível acessar a classe de pacote

    }
}
