public class ATM {
    int[] denominations = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int countBanknotes(int sum) {
        int count = 0;
        int remainingSum = sum;
        int index = 0;

        while(remainingSum > 0 && index < denominations.length){
            int denomination = denominations[index];
            int notesCount = remainingSum / denomination;
            count += notesCount;
            remainingSum -= notesCount * denomination;
            index++;

        }

        return count;
    }
}
