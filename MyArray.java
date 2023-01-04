

public class MyArray  {
    private int count = 0 ;

    private int arr [];

int len;
    public MyArray(){
        arr = new int[0];
        this.len = 0;

    }

    void insert (int item) {
        int newArr[] = new int[arr.length +1];

        for (int i = 0; i< arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[len ] = item;
        len++;
        arr = newArr;


    }

    @Override
    public String toString() {
        if (arr.length ==0) return  null;

        String list = "[ ";
        for (int i =0; i < arr.length; i++){

            list += (i != arr.length-1) ?  arr[i]+ " , " : arr[i] + " " ;
        }
        list += "]";


    return  list;
    }

    void printOnScreen() {

        for (int item : arr){
            System.out.println(item);
        }

    }
    int size (){
        return len;
    }







}
