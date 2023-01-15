public class ThirdObserver {

    public ThirdObserver(EventSource eventSource){
        eventSource.addObserver(new Observer() {
            @Override
            public void update(String event) {
                System.out.println("ThirdObserber reveived event: " + event);
            }
        });

    }
}
