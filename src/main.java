import java.lang.reflect.Constructor;

public class main {
    public static void main(String[] args) {
        Serie marvel = new Serie();
        int op;
        do{
            op = marvel.menu();
            switch (op){
                case 1:
                    System.out.println("Constructor por defecto");
                    marvel.defecto();
                    break;
                case 2:
                    System.out.println("Contructor titulo y creador");
                    marvel.titulo();
            }
        }while(op != 0);
    }

}
