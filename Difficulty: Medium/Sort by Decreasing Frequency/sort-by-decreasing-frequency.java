class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            list.add(num);
        }

        list.sort((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a); // Higher frequency first
            }
            return a - b; // Smaller number first if frequencies tie
        });

        return list;
    }
}