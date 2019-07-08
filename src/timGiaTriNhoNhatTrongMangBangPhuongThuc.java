public class timGiaTriNhoNhatTrongMangBangPhuongThuc {
    public static String giaTriNhoNhat(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return min + " o vi tri " + (index + 1);
    }

    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 2, 6, 9};
        String sonhonhat = giaTriNhoNhat(array);
        System.out.println(sonhonhat);
    }
}
