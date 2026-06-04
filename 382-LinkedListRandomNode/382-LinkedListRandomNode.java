// Last updated: 04/06/2026, 13:18:02
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    // Required by the test runner!
    public static ListNode deserialize(String data) {
        data = data.replaceAll("\\[|\\]|\\s", ""); // remove brackets and spaces
        if (data.isEmpty()) return null;

        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part));
            current = current.next;
        }
        return dummy.next;
    }
}

class Solution {
    private ListNode head;
    private Random rand;

    public Solution(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }

    public int getRandom() {
        ListNode current = head;
        int result = current.val;
        int count = 1;

        while (current != null) {
            if (rand.nextInt(count) == 0) {
                result = current.val;
            }
            current = current.next;
            count++;
        }

        return result;
    }
}

