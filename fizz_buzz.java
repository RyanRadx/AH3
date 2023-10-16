import javax.swing.JOptionPane;

public class fizz_buzz {

    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Input any number", "Number Fizz Buzzer", JOptionPane.OK_CANCEL_OPTION));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i<=n; i++){
            
            if (i % 3 == 0 && i % 5 != 0 && i != n){
                sb.append("FIZZ, ");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i != n){
                sb.append("BUZZ, ");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i != n){
                sb.append("FIZZBUZZ, ");
            }
            else if (i != n){
                sb.append(i + ", ");
            }
            else if (i % 3 == 0 && i % 5 != 0 && i == n){
                sb.append("FIZZ.");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i == n){
                sb.append("BUZZ.");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i == n){
                sb.append("FIZZBUZZ.");
            }
            else {
                sb.append(i + ".");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Your new string is:\n" + sb.toString(), "Number Fizz Buzzer", JOptionPane.OK_OPTION);
    }
}
