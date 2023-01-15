class ObserverDemo {
    public static void main(String[] args) {
        EventSource eventSource = new SystemInScanner();

        new FirstObserver(eventSource);
        new SecondObserver(eventSource);
        new ThirdObserver(eventSource);
        new FirstObserver(new FourthObserver(eventSource));

        ((SystemInScanner) eventSource).scanSystemIn();
    }
}