 public static int flippingMatrix(List<List<Integer>> matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                counter += Math.max(
                    Math.max(
                        matrix.get(i).get(j),
                        matrix.get(i).get(j + matrix.size() - 1 - 2 * j)
                    ),
                    Math.max(
                        matrix.get(i + matrix.size() - 1 - 2 * i).get(j),
                        matrix.get(i + matrix.size() - 1 - 2 * i).get(j + matrix.size() - 1 - 2 * j)
                    )
                );
            }
        }

        return counter;}