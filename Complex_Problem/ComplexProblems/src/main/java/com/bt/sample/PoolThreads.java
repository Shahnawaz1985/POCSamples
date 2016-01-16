package com.bt.sample;

import java.util.concurrent.BlockingQueue;

public class PoolThreads extends Thread{
	
	private BlockingQueue<?> taskQueue = null;
    private boolean       isStopped = false;

    public PoolThreads(BlockingQueue<?> queue){
        taskQueue = queue;
    }

    public void run(){
        while(!isStopped()){
            try{
                Runnable runnable = (Runnable) taskQueue.remove();
                runnable.run();
            } catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    public synchronized void doStop(){
        isStopped = true;
        this.interrupt(); //break pool thread out of dequeue() call.
    }

    public synchronized boolean isStopped(){
        return isStopped;
    }
}
