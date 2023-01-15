class FourthObserver extends EventSource {
    FourthObserver(EventSource eventSource) {
        eventSource.addObserver(new Observer() {
            @Override
            public void update(String event) {
                System.out.println("FourthObserver received event: " + event);
                FourthObserver.this.notify(event);
            }
        });
    }
}