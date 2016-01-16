package com.bt.sample.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.bt.sample.PoolThreads;

public class CustomThreadPool {
	
	private BlockingQueue taskQueue = null;
    private List<PoolThreads> threads = new ArrayList<PoolThreads>();
    private boolean isStopped = false;
    
    public CustomThreadPool(int noOfThreads, int maxNoOfTasks){
        taskQueue = new ArrayBlockingQueue(maxNoOfTasks);

        for(int i=0; i<noOfThreads; i++){
            threads.add(new PoolThreads(taskQueue));
        }
        for(PoolThreads thread : threads){
            thread.start();
        }
    }
    
    @SuppressWarnings("unchecked")
	public synchronized void  execute(Runnable task) throws Exception{
        if(this.isStopped) throw
            new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.offer(task);
    }

    public synchronized void stop(){
        this.isStopped = true;
        for(PoolThreads thread : threads){
           thread.doStop();
        }
    }

}