package com.epita.socra.app;

import com.epita.socra.app.tools.*;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }


    public void run(){
        int acc = 0;
        while (true) {
            String number = adapter.read();
            if (number.matches("exit"))
                break;
            if (number.matches("[0-9]+"))
                acc+= Integer.parseInt(number);
            else if (number.matches("(([_.] )+[_.])")) {
                acc+= unmorsify.run(number);
            } else {
                adapter.write("Invalid input: Not a number");
                break;
            }
            adapter.write(String.format("%d", acc));
        }

    }

}
