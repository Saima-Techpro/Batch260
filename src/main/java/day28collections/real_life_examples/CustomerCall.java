package day28collections.real_life_examples;

public class CustomerCall {  // CustomerCall class representing a customer call with priority
    /*
    Another real-life example of a PriorityQueue can be found in customer service systems, specifically in call centers
    or customer support systems where customers are queued based on the urgency of their requests.

Scenario: Call Center Customer Support
In a call center, incoming customer calls can be assigned different priorities based on the nature of the issue.
For example:

Emergency calls (e.g., from healthcare or safety services) might be assigned the highest priority.
Technical support calls may have a medium priority.
General inquiries might be assigned the lowest priority.

How it works:
Incoming calls are placed into a PriorityQueue based on their urgency. Each call is represented as
an object with a priority level.
When a customer service representative becomes available, they take the next call from the queue,
ensuring that higher-priority calls are handled first.
This system ensures efficient handling of urgent requests, improving overall customer satisfaction.
This example illustrates how PriorityQueue can manage tasks where the order of processing depends on
priority levels, providing timely responses to urgent issues.
     */
    String customerName;
    int priority; // Lower number means higher priority

    public CustomerCall(String customerName, int priority) {
        this.customerName = customerName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + " | Priority: " + priority;
    }
}
