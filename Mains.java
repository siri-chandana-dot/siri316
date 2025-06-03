public class Linear
{
private int capacity;
private int []table;
private int size;
public Linear(int capacity)
{
this.capacity=capacity;
this.table=new int[capacity];
this.size=0;
for(i=0;i<capacity;i++)
{
table[i]=-1;
}
}
private int hash(int size)
{
return size%capacity;
}
public void insert(int key)
{
if(size==capacity)
{
return;
}
int index=hash(key);
while(table[i]!=-1)
{
index=(index+1)%capacity;
}
table[i]=key;
size++;
}
public void delete(int key)
{
int index=hash(key);
while(table[i]!=-1){
if(table[i]=key)
{
table[i]=-1;
size--;
}
index=(index+1)%capacity;
}
return;
}
public Boolean search(int key)
{
int index=hash(key);
while(table[i]!=-1){
if(table[i]=key)
{
return true;
}
index=(index+1)%capacity;
}
return false;
}
 public void display() {
 System.out.println("Hash Table:");
 for (int i = 0; i < capacity; i++) {
 System.out.println(i + ": " + (table[i] == -1 ? "Empty" : table[i]));
 }
 }
public class Mains
{
public static void main(String[] args)
{Linear<Integer>i=new Linear<Integer>(4);
i.insert(1);
i.insert(2);
i.insert(3);
i.delete(2);
i.display();
i.search(3);
}
}

