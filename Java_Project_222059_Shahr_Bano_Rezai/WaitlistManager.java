import java.util.PriorityQueue;


public class WaitlistManager {

    
    public static class WaitlistEntry implements Comparable<WaitlistEntry> {
        private Student student;
        private int priority;       // lower number = higher priority
        private long timestamp;    

        public WaitlistEntry(Student student, int priority, long timestamp) {
            this.student = student;
            this.priority = priority;
            this.timestamp = timestamp;
        }

        public Student getStudent() {
            return student;
        }

        public int getPriority() {
            return priority;
        }

        // compare by priority first, then timestamp
        @Override
        public int compareTo(WaitlistEntry other) {
            if (this.priority != other.priority) return this.priority - other.priority;
            return Long.compare(this.timestamp, other.timestamp);
        }

        @Override
        public String toString() {
            return student + " (Priority: " + priority + ")";
        }
    }

    private PriorityQueue<WaitlistEntry> courseWaitlist = new PriorityQueue<>();

    
    public void addToWaitlist(Student s, int priority) {
        if (s == null) return;  // ignore null
        long timestamp = System.currentTimeMillis();
        courseWaitlist.offer(new WaitlistEntry(s, priority, timestamp));
        try {
            Thread.sleep(1); // ensure unique timestamp
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // remove and return next student
    public WaitlistEntry processNextStudent() {
        return courseWaitlist.poll();
    }

    
    public WaitlistEntry peekNextStudent() {
        return courseWaitlist.peek();
    }

    // get size of waitlist
    public int getWaitlistSize() {
        return courseWaitlist.size();
    }

    
    public void displayWaitlist() {
        System.out.println("Current Waitlist:");
        for (WaitlistEntry entry : courseWaitlist) {
            System.out.println(entry);
        }
    }
}
