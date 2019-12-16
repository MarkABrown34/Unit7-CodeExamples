package edu.cscc.innerclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerAndAnonymousClassesExample {

    public static void main(String[] args) {
        ActionListener clickListener = buildClickListener();
        Frame frame = buildFrame(clickListener);
        frame.addWindowListener(new MyWindowAdapter(frame));
    }

    private static ActionListener buildClickListener() {
        //This is an example of an "anonymous" class. We declare it in-line instead of
        // explicitly declaring a class.
        //ActionListener is just an interface provided by Java, but we can create a "new" object that implicitly
        //extends ActionListener and implements its methods.
        return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Hello, world!");
                }
            };
    }

    private static Frame buildFrame(ActionListener clickListener) {
        Frame frame = new Frame();
        Button button = new Button("click me");
        button.setBounds(30, 50, 80, 30);
        button.addActionListener(clickListener);
        frame.add(button);
        frame.setSize(200, 100);
        frame.setLayout(null);
        frame.setVisible(true);

        return frame;
    }

    /**
     * This is an inner class.
     * We are explicitly declaring it inside of another class.
     * We had to make this class static in order to use it in the static context of main().
     */
    static class MyWindowAdapter extends WindowAdapter {

        //Frame shouldn't change, so we can declare it final here.
        private final Frame frame;

        public MyWindowAdapter(Frame frame) {
            this.frame = frame;
        }
        @Override
        public void windowClosing(WindowEvent e) {
            frame.dispose();

            //This is a method local inner class.
            //It only exists within this method.
            //Method local inner classes were introduced in Java 8.
            class ProgramCloser {
                //Constants are static and final. There is only one of them and they can't change.
                private static final int SUCCESS = 0;

                void close() {
                    System.exit(SUCCESS);
                }
            }

            ProgramCloser programCloser = new ProgramCloser();
            programCloser.close();
        }
    }
}
