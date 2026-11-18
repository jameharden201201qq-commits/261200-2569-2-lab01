import java.util.Scanner ;


public int[] bubble_sort(int []arrays){
    int size = arrays.length;
    int temp;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size - 1; j++) {   // size ต้องลบ 1 เพราะ j+1 บรรทีดล่างจะทำให้ arrays เกิน
            if (arrays[j] > arrays[j + 1]) {
                temp = arrays[j];
                arrays[j] = arrays[j + 1];
                arrays[j + 1] = temp;
            }
        }
    }
    return arrays ;
}

void main() {
    Scanner scanner = new Scanner(System.in); //System.in == ดึงค่าจาก keybord
    IO.print("Size of Numbers : ") ;
    int size = scanner.nextInt();   // scanner.nextInt() คือ spilt inputs by spacebar
    IO.print("Numbers : ") ;
    int[] numbers = new int[size];
    for(int i = 0; i < size ; i++){    // ใส่ Input ไปในแต่ละตำแหน่ง arrays
       numbers[i] = scanner.nextInt();
    }
    int[] sorted =  bubble_sort(numbers);  // sort operation จาก def/function
    for(int i = 0; i < size; i++){    // print แต่ละตัวออกมา
        IO.print(sorted[i] + " ");
    }



}