import java.util.Scanner;

public class cuerpoGeometrico {
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opc = Menu();
        desarrollarCalculos(opc);
           

    }

    public static int  Menu(){
        System.out.println("Selecciona un Cuerpo Geométrico:");
        System.out.println("1. Prisma");
        System.out.println("2. Cilindro");
        System.out.println("3. Pirámide"); 
        System.out.println("4. Cono");
        System.out.println("5. Esfera");
        System.out.println("6. Zona Esferica"); 
        System.out.println("7. Casquete Esferico ");
        System.out.println("8. Hueso Esferico y Cuña Esferica");
        System.out.println("9. Ortoedro");
        System.out.println("10. Tetaedro");
        System.out.println("11. Hexaedro");
        System.out.println("12. Octaedro");
        System.out.println("13. Dodecaedro");
        System.out.println("14. Icosaedro");
        System.out.println("15. Tronco de Cono");
        System.out.println("16. Trono de Piramide");

        
    }

}()