package com.java.collections.linkedlistImpl;

public class BrowserHistory {
    Node currentNode;

    public BrowserHistory() {
        this.currentNode = null;
    }

    public void visit(String url) {
        Node node = new Node(url);
        if (currentNode == null) {
            currentNode = node;
        }

    }
}
