/*
ADVANCED DSA - Design a Data Structure for Finding the Median in a Data Stream
Design a data structure that supports two operations on a stream of integers: addNum(int num): Adds a new integer num to the data stream. findMedian(): Returns the median of all elements added to the data stream so far. The median is the middle value in an ordered integer list. If the size of the list is odd, the median is the middle element. If the size is even, the median is the average of the two middle elements. The solution must be implemented via a function that processes a sequence of operations and returns the results of all findMedian calls.

Problem Description
Design a data structure that supports two operations on a stream of integers:
addNum(int num): Adds a new integer num to the data stream.
findMedian(): Returns the median of all elements added to the data stream so far.
The median is the middle value in an ordered integer list. If the size of the list is odd, the median is the middle element. If the size is even, the median is the average of the two middle elements.
The solution must be implemented via a function that processes a sequence of operations and returns the results of all findMedian calls.

Constraints
Input Constraints:

The total number of operations is between and .

For each addNum operation, the number num is between and .

The sequence of operations will contain at least one call to findMedian.

The length of the ops list will equal .

The length of the values list will equal the number of "addNum" operations in ops.

Output Constraints:

The function must return a list of floating-point numbers, representing the results of all findMedian operations, in the order they occur.

All Test Cases
Test Case 1
Input:
{"ops": ["addNum", "addNum", "findMedian", "addNum", "findMedian", "addNum", "findMedian"], "values": [1, 2, 3, 4]}
Expected Output:
[1.5, 2.0, 2.5]
Test Case 2
Input:
{"ops": ["addNum", "addNum", "addNum", "findMedian", "findMedian"], "values": [5, 10, 15]}
Expected Output:
[10.0, 10.0]
*/

import java.util.*;

class MedianFinder {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add to maxHeap or minHeap
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // Balance heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }

        return maxHeap.peek();
    }
}

public class Main {

    public static List<Double> processOperations(String[] ops, int[] values) {

        MedianFinder mf = new MedianFinder();
        List<Double> result = new ArrayList<>();

        int valueIndex = 0;

        for (String op : ops) {

            if (op.equals("addNum")) {
                mf.addNum(values[valueIndex]);
                valueIndex++;
            }

            else if (op.equals("findMedian")) {
                result.add(mf.findMedian());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] ops = {
            "addNum", "addNum", "findMedian",
            "addNum", "findMedian",
            "addNum", "findMedian"
        };

        int[] values = {1, 2, 3, 4};

        List<Double> ans = processOperations(ops, values);

        System.out.println(ans);
    }
}