package day28collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextEditor {
    /*
    Another real-life example of using an ArrayDeque could be in a task scheduling system:

Scenario: Undo and Redo Operations in a Text Editor
In text editors, users often want to undo recent changes or redo previously undone actions.
This can be implemented using two ArrayDeque instances:

Undo stack: Stores all actions that can be undone.
Redo stack: Stores actions that were undone and can be redone.
When the user performs an operation (like typing or deleting), it is pushed onto the undo stack.
If the user undoes the action, it is moved from the undo stack to the redo stack.
If the user decides to redo the operation, it is moved back from the redo stack to the undo stack.

This pattern is useful in many applications that support undo/redo features, from text editors to graphic design tools.

How it works:
performOperation(): When the user makes a change (e.g., typing), the current content is pushed to the undo stack. After the change, the redo stack is cleared.
undo(): Moves the current content to the redo stack and retrieves the last content from the undo stack.
redo(): Moves the current content to the undo stack and retrieves the last undone content from the redo stack.
This simple example demonstrates how ArrayDeque can be used to implement undo/redo functionality in a text editor!
     */
    private Deque<String> undoStack = new ArrayDeque<>();
    private Deque<String> redoStack = new ArrayDeque<>();
    private String currentContent = "";

    // Perform an operation (such as typing or deleting)
    public void performOperation(String newContent) {
        undoStack.push(currentContent);  // Save current content for undo
        currentContent = newContent;     // Update the content
        redoStack.clear();               // Clear redo history
        System.out.println("Current content: " + currentContent);
    }

    // Undo the last operation
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentContent);    // Save current content for redo
            currentContent = undoStack.pop();  // Restore the last content
            System.out.println("Undo performed. Current content: " + currentContent);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    // Redo the last undone operation
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentContent);    // Save current content for undo
            currentContent = redoStack.pop();  // Restore the content from redo stack
            System.out.println("Redo performed. Current content: " + currentContent);
        } else {
            System.out.println("No actions to redo.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Simulate text editing operations
        editor.performOperation("Hello");
        editor.performOperation("Hello, World!");
        editor.performOperation("Hello, Java!");

        // Undo actions
        editor.undo();  // Undoes "Hello, Java!" to "Hello, World!"
        editor.undo();  // Undoes "Hello, World!" to "Hello"

        // Redo actions
        editor.redo();  // Redoes "Hello" to "Hello, World!"

        // Perform a new operation
        editor.performOperation("Hello, Java Programming!");  // Clears redo history

        // Try redo after a new operation
        editor.redo();  // No actions to redo
    }
}