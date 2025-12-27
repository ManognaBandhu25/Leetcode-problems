import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // Sort meetings by start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap of free rooms by room number
        PriorityQueue<Integer> freeRooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            freeRooms.offer(i);
        }

        // Min-heap of ongoing meetings: [endTime, roomNumber]
        PriorityQueue<long[]> ongoingMeetings = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        // Count of meetings for each room
        int[] roomCount = new int[n];

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            long duration = end - start;

            // Free up rooms that have ended by current meeting start time
            while (!ongoingMeetings.isEmpty() && ongoingMeetings.peek()[0] <= start) {
                int freedRoom = (int) ongoingMeetings.poll()[1];
                freeRooms.offer(freedRoom);
            }

            if (!freeRooms.isEmpty()) {
                // Assign to the free room with smallest number
                int room = freeRooms.poll();
                roomCount[room]++;
                ongoingMeetings.offer(new long[]{start + duration, room});
            } else {
                // No room free, delay meeting
                long[] nextFree = ongoingMeetings.poll();
                long newStart = nextFree[0];
                int room = (int) nextFree[1];
                roomCount[room]++;
                ongoingMeetings.offer(new long[]{newStart + duration, room});
            }
        }

        // Find the room with the most meetings
        int maxMeetings = 0;
        int resultRoom = 0;
        for (int i = 0; i < n; i++) {
            if (roomCount[i] > maxMeetings) {
                maxMeetings = roomCount[i];
                resultRoom = i;
            }
        }

        return resultRoom;
    }
}
