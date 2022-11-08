import java.util.*;
public class CircularLinkList
{
    static boolean duplicateOrNot(Node head){
       
        if(head==null)return false;
        HashSet<Integer> hs = new HashSet<Integer>();
        Node tmp=head;
        while(tmp!=null){
            if(hs.contains(tmp.data))
            return true;
            else
            hs.add(tmp.data);
            tmp=tmp.next;
        }
        return false;
        
    }
    static Node addFirstNodeC(Node Last,int data){
        if(Last!=null)
        return Last;
        Node newnode = new Node(data);
        if(Last==null){
            Last=newnode;
            newnode.next=newnode;
        }
        return Last;
    }
    static Node addFrontC(Node Last ,int data){
        if(Last ==null){
        return addFirstNodeC(Last,data);
        }
        Node newnode= new Node(data);
        newnode.next=Last.next;
        Last.next=newnode;
        return Last;
    }
    static Node addLastC(Node Last,int n){
        if(Last ==null)
        return addFirstNodeC(Last,n);
        Node newnode = new Node(n);
        newnode.next=Last.next;
        Last.next=newnode;
        Last=newnode;
        
        return Last;
    }
    static void printListC(Node Last){
        if(Last==null){
            System.out.println("Empty List...");
            return;
            }
            Node tmp = Last.next;
            do{
                System.out.print(tmp.data+"->");
                 tmp=tmp.next;
            }while(tmp!=Last.next);
    }
    static boolean findData(Node Last,int data){
        if(Last==null){
            System.out.println("Empty List...");
            return false;
            }
            Node tmp = Last.next;
            do{
               if(tmp.data==data)
               {
                   return true;
               }
                 tmp=tmp.next;
            }while(tmp!=Last.next);
            return false;
    }
    static Node addAfter(Node last,int m, int n){
            if(last==null){
            System.out.println("Empty List...");
            return last;
            }
            Node tmp = last.next;
            do{
                if(tmp.data==m){
                    Node newnode=new Node(n);
                    newnode.next=tmp.next;
                    tmp.next=newnode;
                    
                    if(last==tmp)
                    last=newnode;
                    
                    return last;
                    
                }
                 tmp=tmp.next;
            }while(tmp!=last.next);
            
            return last;
    }
    static int findIndex(Node last, int m){
        if(last==null){
            System.out.println("Empty List...");
            return -1;
            }
            Node tmp = last.next;
            //Node prev = last;
            int count=-1;
            do{
                count++;
                if(tmp.data==m){
                    return count;
                }
                 tmp=tmp.next;
            }while(tmp!=last.next);
            return -1;
    }
    static Node deleteLast(Node last){
        if(last==last.next)return null;
        Node tmp=last.next;
        do{
            
            tmp=tmp.next;
            
        }while(tmp.next!=last);
        tmp.next=last.next;
        last=tmp;
        return last;
    }
    static Node deleteFirst(Node last){
        if(last==null || last==last.next)return null;
        Node tmp=last.next;
        last.next=tmp.next;
        return last;
    }
    static Node deleteAfterNode(Node last,int m){
        if(last==null)return null;
        Node tmp = last.next;
        if(last.next==last)return last;
        
         
        do{
            if(tmp.data==m){
                if(tmp.next==last){
                    tmp.next=tmp.next.next;
                    last=tmp;
                    return last;
                }else{
                tmp.next=tmp.next.next;
                }
                return last; 
            }
            tmp=tmp.next;
        }while(tmp!=last.next);
            
       return last;
        
        }
    static int minMissingNo(int[] arr){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            
            if(arr[i] < 0)
                arr[i] = 0;
                else
                    max=arr[i];
        }   
        max++;
        for(int i=0;i<n;i++){
            int val= arr[i]%max;
            if(val>0 && val<=n){
                arr[val-1]=arr[val-1]+max;
            }
        }
        for(int i =0;i<n;i++ ){
            if(arr[i]<max)return i+1;
        }
        return max;
        }
        static void maxFrequencyOnO1(int[] arr){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            
            if(arr[i] < 0)
                arr[i] = 0;
                else if (arr[i]>max)
                    max=arr[i];
            }
        max++;
        for(int i=0;i<n;i++){
            int val= arr[i]%max;
            if(val>0 && val<=n){
                arr[val-1]=arr[val-1]+max;
            }
        }
        //int maxfreq =0,
        int num =0;
        for(int i =0;i<n;i++ ){
            if(arr[i]>max){
            // maxfreq=arr[i]/max;
            num=arr[i]/max;
            System.out.println(i+1+" : "+num);
            }
        }
        }
        // System.out.print("max frequerncy of element "+num+" is "+maxfreq);
        static int lastMissingEle(int[] arr){
        int max = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0)
                arr[i] = 0;
            max = Math.max(max, arr[i]);
        }
        max++;
        for(int i = 0; i < n; i++){
            int val = arr[i] % max;
            if(val > 0 && val <= n){
                arr[val - 1] = arr[val - 1] + max;
            }
        }
	    int maxnum=Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < max){
                if(i>maxnum){
                  maxnum=i;  
                }
            }
        }    
	    return maxnum;
	
}
}
class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}