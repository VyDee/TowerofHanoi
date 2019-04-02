package com.example.towerofhanoi;

public class Stack
{
    public Node top;
    private int count;

    public Stack()
    {
        this.top = null;
        this.count = 0;
    }

    public int getCount()
    {
        return  this.count;
    }

    public void push(int payload)
    {
        Node n = new Node(payload);
        n.setNextNode(this.top);
        this.top = n;
        count++;
    }

    public int pop ()
    {
        // we are assuming that we will not call on the empty list

        Node nodeToReturn = this.top;
        this.top = this.top.getNextNode();
        nodeToReturn.setNextNode(null);
        count --;
        return nodeToReturn.getPayload();
    }

    public int peek()
    {
        //we are assuming we will not call peek on the empty list
        return this.top.getPayload();
    }

    public void display()
    {
        //show elements one per line
        if (this.top == null)
        {
            System.out.println("Empty Stack");
        }
        else
        {
            Node currNode = this.top;
            do
            {
                System.out.println("*****" + currNode.getPayload());
                currNode = currNode.getNextNode();
            }
            while(currNode!=null);
        }
    }
}
