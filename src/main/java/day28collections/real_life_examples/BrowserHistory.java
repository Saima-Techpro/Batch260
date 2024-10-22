package day28collections.real_life_examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    /*
    A real-life example of using an ArrayDeque (which implements the Deque interface) can be found in browser history
    navigation in web browsers. Browsers typically allow you to move back and forward between visited web pages.
    This behavior can be implemented using a double-ended queue (Deque), and ArrayDeque is a great choice
    for this kind of operation.

Scenario: Browser History Navigation
Imagine you have a browser that allows you to:

Visit new pages (add them to history).
Go back to the previous page.
Go forward to the next page (after going back).
How ArrayDeque is used:
The back stack stores pages as you visit them. When you go back, the current page is moved to the forward stack,
and you retrieve the last page you visited from the back stack.
If you press the forward button, you take the top element from the forward stack and add it to the back stack.
When you visit a new page, the forward stack is cleared because you can no longer go forward to pages beyond this new one.

Explanation of the Example:
Visit pages: Pages are added to the back stack as you navigate.
Back navigation: When you go back, the current page is pushed to the forward stack, and the previous page
is popped from the back stack.
Forward navigation: When going forward, the current page is pushed to the back stack, and the next page
is popped from the forward stack.
Clear forward history on new visit: Visiting a new page clears the forward stack because the "forward" navigation
is no longer valid after visiting a new page.
Why ArrayDeque is Suitable:
Fast operations: ArrayDeque provides constant-time performance for adding and removing elements from both
ends of the deque, making it efficient for back and forward operations.
No capacity restrictions: Unlike Stack or LinkedList, ArrayDeque has no capacity restrictions and can
grow dynamically as needed.
Efficient memory usage: ArrayDeque uses an array internally, which tends to use memory more
efficiently than linked-list-based structures.
     */
    private Deque<String> backStack = new ArrayDeque<>();
    private Deque<String> forwardStack = new ArrayDeque<>();
    private String currentPage;

    // Visiting a new page
    public void visit(String page) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = page;
        forwardStack.clear(); // Clear forward history when visiting a new page
        System.out.println("Visited: " + currentPage);
    }

    // Going back to the previous page
    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No more pages to go back to.");
        }
    }

    // Going forward to the next page
    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No more pages to go forward to.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        // Simulate browsing history
        history.visit("Page 1");
        history.visit("Page 2");
        history.visit("Page 3");

        // Go back
        history.back();  // Goes back to Page 2
        history.back();  // Goes back to Page 1

        // Go forward
        history.forward();  // Goes forward to Page 2

        // Visit a new page
        history.visit("Page 4");  // Forward stack gets cleared

        // Try to go forward (but it won't work because the forward stack is empty)
        history.forward();  // No more pages to go forward to
    }
}
