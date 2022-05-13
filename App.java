import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      int numero = 10;
      String resultado = "";
      if(numero>=0){
          resultado = "positivo";
      }else{ 
          resultado = "negativo";

      }
// laçode repeticao if else



int a,n, resu = 1;  //a = base : n = expoente

Scanner input = new Scanner (System.in); 
System.out.println("informe a base:");
a = input.nextInt();

System.out.println("informe o expoente:");
n = input.nextInt();
for (int i = n; i >= 1;i--){
    resu= resu * a;

}

        System.out.println("Hello, World! O numero e" + resultado +    resu ) ;


    }
}
