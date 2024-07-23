import javax.swing.*;

public class suma {
    int num1,num2,operacion, suma,sum;
    {


        operacion =Integer.parseInt(JOptionPane.showInputDialog(" 1.sumar 2. restar 3. multiplicar 4. dividir 5.mostrar resultados"));

        while (operacion != 5 ) {

            switch ( (int) operacion ) {


                case 1:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero"));
                    num2 =Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero"));
                    suma= num1+num2;
                    sum= suma++ +sum;



                    JOptionPane.showMessageDialog(null, "resultado " +sum);


            }
}
    }
}
