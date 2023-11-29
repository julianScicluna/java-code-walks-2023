package IntroductionSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.util.Random;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MouseAccuracyTraining {
    
    // --- My GUI Objects ------
    JFrame frame;

    JPanel panel;

    // --- Other Data -----------
    boolean isDotVisible;

    final int SCREEN_SIZE = 800;

    // using parallel arrays to keep track of the when the dot showed and when the user clicked on it
    LocalTime[] roundStartTime = new LocalTime[10];
    
    LocalTime[] roundEndTime = new LocalTime[10];

    int averageTime;  // store average time which is taken as a score

    int totalRounds;  // can set any number of rounds

    int currentRound; // keep track of the current round

    // this is a special method which we call the constructor
    // when we type "new" and the compiler sees it, it will look for this
    public MouseAccuracyTraining() {
        frame = new JFrame("Mouse Accuracy Practice");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(SCREEN_SIZE, SCREEN_SIZE);

        panel = new JPanel(null); // absolute layout
        frame.add(panel);

        isDotVisible = false;
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isDotVisible) {
                    // record the end time of this round
                    roundEndTime[currentRound - 1] = LocalTime.now();
                    
                    // clear components in the panel
                    panel.removeAll();
                    
                    // hide the dot
                    hideDot();
                }
            }
        });
    }

    public void play() {

        totalRounds = 10; // adjust accordingly
        currentRound = 0;

        // ChatGPT told me how to use a timer to try to display dots at
        // specific intervals, for e.g., every 2 seconds (2000 ms)
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isDotVisible) {
                    if (currentRound < totalRounds) {
                        currentRound++;
                        displayDot();
                        roundStartTime[currentRound - 1] = LocalTime.now();
                    } else {
                        // stop the timer after displaying dots 10 times
                        ((Timer) e.getSource()).stop();
                        
                        // calculate a score
                        calculateScore();
                        
                        // give feedback to the user (display the score)
                        displayScore();
                    }
                }
            }
        });

        timer.start();

        frame.setVisible(true);
    }

    public void displayDot() {
        isDotVisible = true;

        // create an instance of the DotComponent class
        DotComponent dot = new DotComponent();

        // calculate a random position to display the dot
        Random generator = new Random();
        int randomX = generator.nextInt((SCREEN_SIZE - dot.UPPER_BOUND));
        int randomY = generator.nextInt((SCREEN_SIZE - dot.UPPER_BOUND));
        
        // we are setting the coordinates of the dot relative to the panel
        dot.setBounds(randomX, randomY, dot.UPPER_BOUND, dot.UPPER_BOUND); 
        
        // put the dot on display
        panel.add(dot);

        // force a refresh of the components
        frame.revalidate();
        frame.repaint();
    }

    public void hideDot() {
        isDotVisible = false;
        frame.revalidate();
        frame.repaint();
    }

    public void calculateScore() {
        // calculate the average time
        // todo: change logic as appropriate
        int totalTime = 0;
        for (int i = 0; i < totalRounds; i++) {
            int time = (int) (roundStartTime[i].until(roundEndTime[i], ChronoUnit.MILLIS));
            totalTime = totalTime + time;
        }
        averageTime = totalTime/totalRounds;
    }

    public void displayScore() {
        String feedbackMessage = "Your reaction time is: " + averageTime;
        
        JLabel label = new JLabel(feedbackMessage);
        panel.setLayout(new FlowLayout());
        panel.add(label);
        
        // force a refresh of the components
        frame.revalidate();
        frame.repaint();
    }

    // ChatGPT told me to create a private DotComponent here
    // Here I can adjust the look and feel of my dot, e.g., colour, width etc...
    private class DotComponent extends JPanel {

        final int UPPER_BOUND = 80; // adjust accordingly

        final int DOT_SIZE = 20; // adjust accordingly

        public DotComponent() {
            setPreferredSize(new Dimension(UPPER_BOUND, UPPER_BOUND)); // adjust the size as needed
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            
            int dotSize = DOT_SIZE;
            int width = this.getWidth();
            int height = this.getHeight();
            int x = (int) (width - dotSize) / 2;
            int y = (int) (height - dotSize) / 2;

            g2d.setColor(Color.RED);
            g2d.fillOval(x, y, dotSize, dotSize);
        }
    }
}
