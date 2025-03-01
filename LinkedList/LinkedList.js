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

    push (data)
    {
        const node = new Node(data)
        if(!this.head){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail=node;
        }
        this.length++;
        return this;
    }

    print()
    {

        let curretNode = this.head;
        // sconsole.log(node);
        while(node)
        {
            console.log(node);
            curretNode = node.next;
            // console.log(node);
            node = nodeNext;
        }
    }
}

const list = new LinkedList(4);
console.log(list);
console.log("0 ==============")
list.push(7);
console.log(list);
console.log("1 ==============")
list.print();
console.log("2 ==============")