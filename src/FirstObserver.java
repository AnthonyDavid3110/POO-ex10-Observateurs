class FirstObserver implements Observer {
    FirstObserver(EventSource eventSource) {
        eventSource.addObserver(this); }

    public void update(String event) {
        System.out.println("FirstObserver received event: " + event);
    }
}