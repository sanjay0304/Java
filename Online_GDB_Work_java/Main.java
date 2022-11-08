import java.util.*;
public class Main
{
    
        static class Bank{
         static float roi;
        
        // Bank(float roi){
        //     roi=roi;
        // }
        
        static float getROI(){
            return roi;
        }
        static void setROI(float roip){
            roi=roip;
        }
    }
    static float returnBankROI(){
        return Bank.roi;//getROI();
    }
    
    static void applyROIToBank(float roiB){
        Bank.roi=roiB;//setROI(roiB);
    }
    static void reverseArrayInPlace(int[] arr){
        int j=arr.length-1;
        int mid = arr.length/2;
        for(int i =0;i<mid;i++,j--){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
        
    }
    static void dayAfterDays(String day, int dayafter){
        int daytofind = dayafter%7;
        String days[] = new String[]{"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
        int indx=-1; 
        for(int i =0;i<7;i++){
            if(days[i].compareTo(day)==0)
            indx=i;
        }
        if(indx==(-1)){
            System.out.println("please provide a valid 3 letter day: like Mon Tue Thur");
            return;
        }
        System.out.println("Day after "+ dayafter+" days is: "+days[(indx+daytofind)%7]);
    }
	public static void main(String[] args) {
	    String []names = new String[]{"Sanjay","Kabir","John","John","Alina","Linda","Josephus","Sanjay"};
	    CustomString.frequencyOfWords(names);
	    
	    int arr[] = new int[]{12, 34, 10, 6, 40};
        int sum = PositiveNumSum.LargestSumPair(arr);
        System.out.println("Sum of largest pair is "+sum);
        String name = "ahggjhglkuhgfdfddytruyiklhghjggfgggg";
        CustomString.frequencyOfChar(name);
        System.out.println(StringReverse.reverseString("Sanjay"));
        
        
        int arr1[] = new int[]{1, -1, 3, 2, -7, -5, 11, 6 };
        for(int ele:arr1){
            System.out.print(ele +" ");
        }
        System.out.println();
        Student.negativeAtEnd(arr1);
        for(int ele:arr1){
            System.out.print(ele +" ");
        }
// // 	    applyROIToBank(4.5f);
// // 	    System.out.println(returnBankROI()); 
// 	    Scanner sc = new Scanner(System.in);
// 	    System.out.println("Enter Taday's Day...");
// 	    String dayToday = sc.nextLine();
// 	    System.out.println("Add the days after today...");
// 	    int days = sc.nextInt();
// 	   dayAfterDays(dayToday,days);
// // 	   // System.out.println(Bank.getROI());
	    
// // 		int[] arr = new int[]{4,57,4,5,1,7,8};
// // 		reverseArrayInPlace(arr);
		
// // 		for(int ele:arr)
// // 		System.out.print(ele +"  ");
	
 		
//         Node last = null;
//         last = CircularLinkList.addFirstNodeC(last,50);
        
//         last = CircularLinkList.addFrontC(last,40);
//         last = CircularLinkList.addLastC(last,60);
//         System.out.println("last node address " +last);
//         System.out.println("next node of last " +last.next);
//         System.out.println("last node data " +last.data);
//         last = CircularLinkList.addAfter(last ,40,45);
//         //last = CircularLinkList.addAfter(last ,60,70);
//         System.out.println(CircularLinkList.findIndex(last,60));
//         CircularLinkList.printListC(last);
//         //last = CircularLinkList.deleteAfterNode(last,40);CircularLinkList.printListC(last);
//         System.out.println();
//         // for(int i = 0; i<5 ;i++){
//         //   last = CircularLinkList.deleteLast(last);System.out.println(); 
//         //   CircularLinkList.printListC(last);
//         // }
// //         last = CircularLinkList.deleteLast(last);System.out.println();
// //         CircularLinkList.printListC(last);
// // 		 last = CircularLinkList.deleteLast(last);System.out.println();
// //         CircularLinkList.printListC(last);
// //         last = CircularLinkList.deleteLast(last);System.out.println();
// //         CircularLinkList.printListC(last);
// //         last = CircularLinkList.deleteLast(last);System.out.println();
// //         CircularLinkList.printListC(last);
// //         last = CircularLinkList.deleteLast(last);System.out.println();
// //         CircularLinkList.printListC(last);
//         CircularLinkList.maxFrequencyOnO1(new int[]{1,1,2,2,2,5,6,9,9,9,9,8,7,4,5,3,2,1});
//         System.out.println(CircularLinkList.lastMissingEle(new int[]{1,1,2,19,2,2,5,6,9,9,9,9,8,7,4,5,3,2,11,1}));
            Scanner sc = new Scanner(System.in);
            Node1 head = null;
            char cont = 'y';
            do{
                if(cont=='y'){
                System.out.print("Enter student\'s Roll No    : ");
                int roll = sc.nextInt();
                //System.out.println();
                System.out.print("Enter student\'s First Name : ");
                String fisrt = sc.next();
                //System.out.println();
                System.out.print("Enter student\'s Last Name  : ");
                String last = sc.next();
                //System.out.println();
                System.out.print("Enter student\'s Father Name: ");
                String father = sc.next();
                father=father+" "+sc.next();
                // System.out.println();
                System.out.print("Enter student\'s Mother Name: ");
                String mother = sc.next();
                mother=mother+" "+sc.next();
                // System.out.println();
                head = Student.add(roll,fisrt,last,father,mother,head);
                Student.printStudents(head);
                System.out.print("Do you want to add another student? y/n: ");
                 cont = sc.next().charAt(0);
                }else
                break;
                
            }while(cont=='y');
            // head = Student.add(1,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(2,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(3,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(4,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(5,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(6,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(7,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(8,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(9,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(10,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(11,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(12,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(13,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(14,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(15,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            // head = Student.add(16,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
            
            head = Student.printStudents(head);
            // Student st1 = new Student(1,"Ansh","Sharma","Sanjay Sharma","Neetu Sharma",head);
           
	}
}
