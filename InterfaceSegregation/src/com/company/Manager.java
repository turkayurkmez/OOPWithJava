package com.company;

public class Manager {
    public void setWorker(Workable worker) {
        this.worker = worker;
    }

    Workable worker;

    public void Manage(){
        worker.Work();
    }


}
