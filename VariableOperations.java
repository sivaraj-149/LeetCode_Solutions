// Final Value of Variable After Performing Operations
// There is a programming language with only four operations and one variable X:

// ++X and X++ increments the value of the variable X by 1.
// --X and X-- decrements the value of the variable X by 1.
// Initially, the value of X is 0.

// Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

class  FinalValueAfterOperations{
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(String s : operations){
            if(s.equals("++X") || s.equals("X++")) sum++;
            else    sum--;
        }
        return sum;
    }
}


// Another way

class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
