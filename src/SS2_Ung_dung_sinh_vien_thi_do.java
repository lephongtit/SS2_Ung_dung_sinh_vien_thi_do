import java.util.Scanner;
public class SS2_Ung_dung_sinh_vien_thi_do {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sr =new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size=sr.nextInt();
            if (size>30)
                System.out.println("Size should not exceed 30");
        }while (size>30);
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a mark for student: "+(i+1)+" :");
            arr[i]=sr.nextInt();
            System.out.println();
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println();
        System.out.print("\n The number of students passing the exam is: " + count);
    }
}
