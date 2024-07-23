import javax.swing.*;

public class restar {
    int num1,num2,operacion, resta,rest;
    {


        operacion =Integer.parseInt(JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados"));

        while (operacion != 5 ) {

            switch ( (int) operacion ) {


                case 2:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero"));
                    num2 =Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero"));
                    resta= num1-num2;
                    rest= resta++ +rest;



                    JOptionPane.showMessageDialog(null, "resultado " +rest);


            }
        }
    }
}

