import javax.swing.*;

public class multiplicacion {


     int num1,num2,operacion, mult1,mult;
     {


    operacion =Integer.parseInt(JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados"));

        while (operacion != 5 ) {

        switch ( (int) operacion ) {


            case 3:
    num1 = Integer.parseInt(JOptionPane.showInputDialog(" ingrese el primer numero"));
    num2 =Integer.parseInt(JOptionPane.showInputDialog(" ingrese el segundo numero"));
    mult1= num1*num2;

    mult=mult1++ + mult;

            JOptionPane.showMessageDialog(null, +num1+ ( "X" )+num2+ (" = ") +" "+mult);

            JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados");
}
        }
                }

                        }

