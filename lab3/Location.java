public class Location {
    public int row;
    public int column;
    public static double maxValue;

    public Location() {
        row = 1;
        column = 1;
        maxValue = 0;
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public static void locatedLargest(double [][] list) {
        int imax = 0;
        int jmax = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {

                if (list[i][j] > list[imax][jmax]) {
                    imax = i;
                    jmax = j;
                    maxValue = list[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент массива, равный " + maxValue + ", находится в позиции (" + imax + ", " + jmax + ")");
    }
}
