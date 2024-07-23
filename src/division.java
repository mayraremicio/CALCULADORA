import javax.swing.*;

public class division {

    int num1, num2, operacion, division;{



    operacion =Integer.parseInt(JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados"));

        while (operacion != 5 ) {

        switch ( (int) operacion ) {
           case 4:
    num1 = Integer.parseInt(JOptionPane.showInputDialog(" ingrese el primer numero"));
    num2 =Integer.parseInt(JOptionPane.showInputDialog(" ingrese el segundo numero"));
    division = num1/num2;

               JOptionPane.showMessageDialog(null, +num1+ ( "X" )+num2+ (" = ") +" "+division);

               JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados");





               }
           }}
        }