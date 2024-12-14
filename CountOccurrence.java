public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {23, 11, 34, 56, 11, 23, 56, 34};
        int[] freq = new int[arr.length];  // Array to store frequency of each element
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            // Inner loop to count occurrences of arr[i]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;  // Mark as visited
                }
            }

            // Store the count of the current element in the frequency array
            if (freq[i] != visited) {
                freq[i] = count;
                System.out.println(arr[i] + " -> " + count);  // Print the count
            }
        }
    }
}
