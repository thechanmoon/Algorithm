class Node{
    constructor(data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    constructor(data)
    {
        const node = new Node(data);
        
        this.head = node;
        this.tail = node;
        this.length = 1;
    }
}

const list = new LinkedList(4);
console.log(list);