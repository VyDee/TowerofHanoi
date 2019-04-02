package com.example.towerofhanoi;

public class Node
{
    private int payload;
    private Node nextNode;

    public Node(int payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public void setNextNode (Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public int getPayload()
    {
        return payload;
    }

    public Node getNextNode()
    {
        return nextNode;
    }
}
