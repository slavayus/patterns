package com.study.patterns.state;

class Human {
    private Activity work;
    private Activity weekend;

    private Activity activity;

    Human(Activity activity) {
        this.activity = activity;
        work = new Work();
        weekend = new Weekend();
    }

    void doSomething() {
        activity.doSomething(this);
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    Activity getWork() {
        return work;
    }

    public void setWork(Activity work) {
        this.work = work;
    }

    Activity getWeekend() {
        return weekend;
    }

    public void setWeekend(Activity weekend) {
        this.weekend = weekend;
    }
}
