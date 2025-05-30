package com.multithreading;


class NewThread1 implements Runnable
{
    Thread t;
    NewThread1()
    {
            // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
        }
        // This is the entry point for the second thread.
        synchronized public void run()
        {
            try {
                for (int i = 5; i > 0; i--)
                {
                    System.out.println("Child Thread: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e)
            { System.out.println("Child interrupted.");
            }
            System.out.println("Exiting child thread.");
        }
}
    class ChildThread
    {
        public static void main(String[] args)
        {
            new NewThread1();
            // create a new thread
            try {
                for(int i = 5; i > 0; i--)
                { System.out.println("Main Thread: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) { System.out.println("Main thread interrupted.");
            }
            System.out.println("Main thread exiting.");
        }
    }