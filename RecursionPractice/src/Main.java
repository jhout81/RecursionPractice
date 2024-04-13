//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // integer array
        int[] numArray = new int[]{4, 7, 8, 9, 3};

        //printing recursive functions to the screen
        System.out.println();
        System.out.println(appendNTimes("dog", 4));

        System.out.println();
        System.out.println("Contains using two functions: " + contains(numArray, 9));

        System.out.println();
        System.out.println("Contains Alternate using single function: " + containsAlt(numArray, 9, 0));

    }

    public static String appendNTimes(String nameToAppend, int numAppendTimes) {
        //returns empty string if less than 0;
        String answerString = "";
        if (numAppendTimes < 0) {
            return "";
        }
        //subtracts 1 everytime the function calls itself if the above condition is not true
        numAppendTimes -= 1;
        //appends the string to itself everytime the function calls itself
        answerString = answerString.concat(nameToAppend);
        System.out.print(answerString);
        System.out.print(" ");
        //recursive function call
        return appendNTimes(nameToAppend, numAppendTimes);

    }
    //My alternate recursive call using one function I did this to help myself better understand
    public static int containsAlt(int[] arrayNums, int secNum, int index) {
        //assigns lenArray to the arrayNums length
        int lenArray = arrayNums.length - 1;
        //increments the index +1 if the if index content does not match the given number
        if (index < lenArray && arrayNums[index] != secNum) {
            index += 1;
        // returns the index if the contents of the index match the given number
        } else if (arrayNums[index] == secNum) {
            return index;
        } else {
            return -1;
        }
        //recursive call
        return containsAlt(arrayNums, secNum, index);
    }
    //Recursive functions following assignment
    public static int contains(int[] arrayNums, int secNum) {
        return containsInner(arrayNums, secNum, 0);
    }

    public static int containsInner(int[] arrayNums, int secNum, int index) {
        if (index >= arrayNums.length) {
            return -1;
        }

        if (arrayNums[index] == secNum) {
            return index;
        }

        index++;
        return containsInner(arrayNums, secNum, index);
    }

}