/************
 * Arnav Madavaram
 * Lab - 6
 * 02-23-2024
 * Using GUI's to calculate the Time of Flight and Maximum Distance by getting input values of Launch Angle and Initial Velocity.
 **/
import javax.swing.JOptionPane;
public class BallisticMotion {
    public static void main(String[] args) {
        final double GRAVITATION = 9.81;
        double launchAngle = 0.0;
        double initialVelocity = 0.0;
        double flightTime = 0.0;
        double maxDistance = 0.0;
        JOptionPane.showMessageDialog(null, "On the next dialogue boxes, please input a launch angle and an initial velocity" , "Important information", JOptionPane.INFORMATION_MESSAGE);
        String AngleofLaunch = JOptionPane.showInputDialog(null, "Launch Angle ? (in degrees) ", "Important Information", JOptionPane.QUESTION_MESSAGE);
        launchAngle = Double.parseDouble(AngleofLaunch);
        System.out.println("Launch Angle: " + launchAngle);
        String startingVelocity = JOptionPane.showInputDialog(null, "Initial Velocity? (in m/s) ", "Important Information", JOptionPane.QUESTION_MESSAGE);
        initialVelocity = Double.parseDouble(startingVelocity);
        System.out.println("Initial Velocity" + initialVelocity);
        flightTime = (2 * initialVelocity * Math.sin(launchAngle)) / (GRAVITATION);
        System.out.println("Time of Flight: " + flightTime);
        maxDistance = (initialVelocity * Math.cos(launchAngle)) * flightTime;
        System.out.println("Maximum Distance: " + maxDistance);
        JOptionPane.showMessageDialog(null, "Time of Flight: " + flightTime + " seconds", "Flight Time", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Time of Flight: " + flightTime + " seconds", "Flight Time", JOptionPane.INFORMATION_MESSAGE);

        String IntVel = JOptionPane.showInputDialog(null,"Please Enter Something","");
                String VEvel = JOptionPane.showInputDialog(null,"Please enter something", "input", JOptionPane.OK_CANCEL_OPTION );
                int WEWIll = Integer.parseInt(VEvel);
                int heyyhoo = JOptionPane.showOptionDialog(null,"would u like this","choice",JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);
                

    }
}
