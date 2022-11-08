import java.util.ArrayList;
class Student{
    
    static void negativeAtEnd(int[] arr){
        int i=0, j=0;
        for(;i<arr.length;i++){
            if(arr[i]<0 ) {
                j=i;
                int tmp = arr[i];
                while(j<arr.length&&arr[j]>0){
                   
                   arr[i]=arr[j];
                   j++;
                }
                arr[j]=tmp;
            }
        }
    }
    
    static Node1 add(int roll, String first_name,String last_name,String father_name,String mother_name,Node1 head){
        Node1 newnode = new Node1(roll,first_name+"\t\t",last_name+"\t\t",father_name+"\t",mother_name);
        if(head==null)return newnode;
        Node1 tmp = head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newnode;
        return head;
    }
    static Node1 printStudents(Node1 head){
        if(head==null)return null;
       Node1 tmp = head;
       System.out.println("_____________________________________________________________________________________________");
       System.out.println("Rolls\tFirst Name\t\tLast Name\t\tFather\'s\t\tMother\'s Name");
       System.out.println("_____________________________________________________________________________________________");
       while(tmp!=null){
           System.out.println(tmp.roll_no+"\t"+tmp.stu_data.get(0)+"\t"+tmp.stu_data.get(1)+"\t"+tmp.stu_data.get(2)+"\t"+tmp.stu_data.get(3));
           System.out.println("---------------------------------------------------------------------------------------------");
           tmp=tmp.next;
       }
       return head;
    }
    
    
    
}
class Node1{
    int roll_no;
    ArrayList<String> stu_data = new ArrayList();
    Node1 next;
    // String first_name;
    // String last_name;
    // String father_name;
    // String mother_name;
    Node1 (){}
    
    Node1(int roll, String first_name,String last_name,String father_name,String mother_name){
        roll_no=roll;
        stu_data.add(first_name);
        stu_data.add(last_name);
        stu_data.add(father_name);
        stu_data.add(mother_name);
        next=null;
    }
    
}

