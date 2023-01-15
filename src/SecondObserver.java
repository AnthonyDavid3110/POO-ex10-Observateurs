class SecondObserver implements Observer {
    SecondObserver(EventSource eventSource) {
        eventSource.addObserver(this);
    }

    public void update(String event) {
        System.out.println("SecondObserver received event: " + event);
    }
}