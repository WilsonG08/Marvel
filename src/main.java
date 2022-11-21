import java.lang.reflect.Constructor;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serie marvel = new Serie();
        int op;
        String aux;
        do{
            op = marvel.menu();
            switch (op){
                case 1:
                    System.out.println("Constructor por defecto");
                    marvel.defecto();
                    break;
                case 2:
                    System.out.println("Contructor titulo y creador");
                    System.out.println("Ingrese el titulo: ");
                    aux = sc.nextLine();
                    marvel.setTitulo(aux);
                    System.out.println("Ingrese el creador: ");
                    aux = sc.nextLine();
                    marvel.setCreador(aux);
                    System.out.println();
                    marvel.defecto();
            }
        }while(op != 0);
    }

}
