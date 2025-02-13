public class lastandfirstoccurence {
            public static void main(String[] args){
            	int[] a = {2, 4, 4, 4, 5, 5, 6, 6, 6, 6, 9};
                int target = 6;

                int firstOccurrence = -1;
                int lastOccurrence = -1;
                int totalOccurrences = 0;

                for (int i = 0; i < a.length; i++) {
                   5 if (a[i] == target) {
                        if (firstOccurrence == -1) {
                            firstOccurrence = i; // Found the first occurrence
                        }
                        lastOccurrence = i;     // Keep updating for the last occurrence
                        totalOccurrences++;       // Count every occurrence
                    }
                }

                System.out.println("First Occurrence of " + target + ": " + firstOccurrence);
                System.out.println("Last Occurrence of " + target + ": " + lastOccurrence);
                System.out.println("Total Occurrences of " + target + ": " + totalOccurrences);
}
}
