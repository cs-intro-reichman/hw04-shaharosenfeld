public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[] {2,3,1})); // true

    }
    
    
    public static int findMissingInt (int [] array) {
        int indexToAdd = 0;
        int notExist = 0;
        if (array.length == 1) {
            notExist = 1;
        }
        else
        {
            for (int i = 0; indexToAdd < array.length; i++)//0<3; i=2
            {
                if (indexToAdd == array[i]) {
                    indexToAdd++;
                    i=0;
                }
                if (i == array.length - 1)
                {
                    return indexToAdd;
                    //indexToAdd++;
                    //i=0;
                }
            }   
        }
        return notExist;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secMax =array[0];
        int pass = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
            {
                max = array[i];
                pass = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (pass != i) {
                if (array[i] > secMax && array[i] <= max) {
                secMax = array[i];
                }
            }
            
        }
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int[]  checker1 = new int[array1.length];    
        int[]  checker2 = new int[array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    checker1[i] = array1[i];
                    j=array2.length;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (checker1[i]!=array1[i]) {
                return false;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    checker2[i] = array2[i];
                    j=array1.length;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (checker2[i]!=array2[i]) {
                return false;
            }
        }
        return true;
    }
        
    
    

    public static boolean isSorted(int [] array) {
        boolean checkerUP = true;
        boolean checkerDown = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) {
                checkerUP = false;
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]<array[i+1]) {
                checkerDown = false;
            }
        }
        if (checkerUP) {
            return true;
        }
        if (checkerDown) {
            return true;
        }
        return false;
    }

}
