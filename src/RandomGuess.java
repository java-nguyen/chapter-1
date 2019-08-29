import javax.swing.*;

public class RandomGuess {
    public static void main(String[] args) {
//        System.out.println("this is...");
        JOptionPane.showMessageDialog(null, "this is" + (1+ (int) (Math.random()*100)));
    }
}
