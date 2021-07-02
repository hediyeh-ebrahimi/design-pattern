package com.tutorial.command.secondSample;

public class _RunnableThread {
    public static void main(String[] args) {
        Task task1 = new Task(1,2);
        Task task2 = new Task(3,4);

        Thread thread = new Thread(task1);
        thread.start();

//        task1.run();
//        task2.run();
    }

    static class Task implements Runnable {
        int num1;
        int num2;

        public Task(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public void run() {
            System.out.println(num1+num2);
        }
    }
}
