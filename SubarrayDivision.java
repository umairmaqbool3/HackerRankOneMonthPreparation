public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int total = 0;
            for (int j = i; j < i + m; j++) {
                total += s.get(j);
            }
            if (total == d) {
                counter++;
            }
        }
        return counter;
    }